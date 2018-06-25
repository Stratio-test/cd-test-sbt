@Library('libpipelines@preproduction') _

hose {
    EMAIL = 'cd'
    BUILDTOOL = 'sbt'
    BUILDTOOLVERSION = '1.1.6'
    NEW_VERSIONING = 'true'

    DEV = { config ->
        echo 'THIS IS MASTER'
        doCompile(config)
	    doUT(config)
        doIT(config)
        doPackage(config)
    }
}
