# coding: UTF-8
from __future__ import absolute_import

from flask import Flask, redirect, url_for
from flask.ext.assets import Environment

from cidadeiluminada import base, protocolos, auth
from cidadeiluminada.base import AppJSONEncoder


def create_app(config=None):
    app = Flask(__name__, instance_relative_config=True)
    Environment(app)
    app.config.from_object('settings')
    app.config.from_pyfile('settings_local.py', silent=True)
    app.json_encoder = AppJSONEncoder
    app.secret_key = app.config.get('SECRET_KEY')

    if config:
        app.config.update(config)

    base.init_app(app)
    auth.init_app(app)
    protocolos.init_app(app)

    @app.route('/')
    def index():
        return redirect(url_for('protocolos.index'))

    @app.context_processor
    def menu_items():
        return {
            'menu_items': [
                (u'Protocolos', 'protocolos.index'),
                (u'(ALPHA) Novo protocolo', 'protocolos.novo_pagina'),
                (u'Gerenciar usuários', 'auth.gerenciar')
            ]
        }

    return app
