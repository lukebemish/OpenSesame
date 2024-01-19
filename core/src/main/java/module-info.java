module dev.lukebemish.opensesame.core {
    requires jdk.unsupported;
    requires org.objectweb.asm;
    requires static org.jetbrains.annotations;

    exports dev.lukebemish.opensesame.runtime;
    exports dev.lukebemish.opensesame.annotations;

    uses dev.lukebemish.opensesame.runtime.RuntimeRemapper;
}