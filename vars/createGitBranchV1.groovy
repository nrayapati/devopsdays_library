#!/usr/bin/groovy
def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    def baseBranch = config.source
    def newBranch = config.target

    if(!baseBranch) {
        error "source is mandatory."
    }

    if(!newBranch) {
        error "target is mandatory."
    }

    println baseBranch
    println newBranch
}