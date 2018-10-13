#!/usr/bin/groovy
def call(Map config = [:]) {
    def baseBranch = config.get('source') ?: 'master'
    def newBranch = config.get('target')

    if(!newBranch) {
        error "target is mandatory."
    }

    println baseBranch
    println newBranch
}