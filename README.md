# Scala Inflector 

This is a fork of https://github.com/backchatio/scala-inflector which appears to be abandoned.

Ports the ruby rails inflector code to scala.  
Includes specs for the inflections.  

You can use the inflections either as an object:
  
```scala
import mojolly.inflector.Inflector

Inflector.singularize("sheep") 
```  

or as an implicit:  

```scala
import mojolly.inflector.InflectorImports._ // this is also a trait

"sheep".singularize
```

## Downloading

```scala
resolvers += Resolver.bintrayRepo("bondlink", "scala-inflector")
libraryDependencies += "bondlink" %% "scala-inflector" % "1.3.7"
```

## Patches
Patches are gladly accepted from their original author. Along with any patches, please state that the patch is your original work and that you license the work to the *rl* project under the MIT License.

## License
MIT licensed. check the [LICENSE](https://github.com/mblink/scala-inflector/blob/master/LICENSE) file
