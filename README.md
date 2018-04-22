Gerrit hide cherry-pick action plugin
=====================================

With this plugin Gerrit shows cherry-pick action only for merged changes. 

Build
-----

To build the plugin with Bazel, install
[Bazel](https://bazel.build/versions/master/docs/install.html), link the plugin
to Gerrit's plugins directory and run:

```
  bazel build plugins/hide-cherrypick-action
```

License
-------

Apache License 2.0
