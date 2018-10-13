+++
title = "Strings"
tags = ["Basics"]
weight = 12
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Strings

```groovy
def myString = 'hello'
 assert '${myString} world' == 'hello world'
assert "${myString} world" == 'hello world'

// assert '''\
// ${myString} world
// foo bar
// ''' == "\\\nhello world\nfoo bar\n"

assert """\
	${myString} world
	foo bar
""".stripIndent() == "hello world\nfoo bar\n"
```