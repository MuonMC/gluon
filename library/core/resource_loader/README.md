# Quilt Resource Loader

This module provides to the game a way to load the resources from mods,
and other resource-loading-related hooks.

## System properties

| Property                                               |  Type   |           Default            | Description                                                                                                  |
|:-------------------------------------------------------|:-------:|:----------------------------:|:-------------------------------------------------------------------------------------------------------------|
| `quilt.resource_loader.disable_caching`                | boolean |           `false`            | Defines if the mod resource caching should be forced-disabled.                                               |
| `quilt.resource_loader.experimental_screen_override`   | boolean |            `true`            | Defines whether the experimental screen override is active or not.                                           |
| `quilt.resource_loader.pack.virtual_async_threads`     |  uint   |   threads / 2 - 1 (min 1)    | Defines the number of threads allocated to Gluon-provided virtual resource pack workers.                       |
| `quilt.resource_loader.debug.pack.dump_from_in_memory` | boolean | `false` (prod), `true` (dev) | Dumps content of Gluon-provided virtual resource packs into `debug/packs/`.                                    |
| `quilt.resource_loader.debug.reloaders_identity`       | boolean | `false` (prod) `true` (dev)  | Prints a warning if a resource reloader that doesn't implement `IdentifiableResourceReloader` is registered. |
| `quilt.resource_loader.debug.reloaders_order`          | boolean |           `false`            | Prints to console the application order of resource reloaders.                                               |

