
var exec = require('cordova/exec');

var PLUGIN_NAME = 'KeyboardPlugin';

var KeyboardPlugin = {
  enable: function() {
    exec(null, null, PLUGIN_NAME, "enable", []);
  },
  disable: function() {
    exec(null, null, PLUGIN_NAME, "disable", []);
  }
};

module.exports = KeyboardPlugin;
