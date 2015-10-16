job('DSL-Tutorial-1-Test') {
    scm {
        git('git://github.com/jgritman/aws-sdk-test.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}

job('DSL-Tutorial-1-Test-Old') {
    scm {
        git('git://github.com/jgritman/aws-sdk-test.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}

