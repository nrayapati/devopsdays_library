+++
title = "retryWithPrompt"
description = "Retry With Prompt"
tags = ["General"]
weight = 5
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### retryWithPrompt

Executes given body and when it throws an exception, it will prompt user with options to Retry, Ignore or Abort.  If it should be retried. The body will then be executed again. If the user clicks abort, an exception will be thrown aborting the pipeline. And there is an option to ignore to proceed further, need to careful of doing so, as some of the steps which were failed may cause some trouble down the line for other actions, so user can ignore when the step being surrounded by this step manually.

#### Usage

* `stepName` - Name of step, to be more meaningful while message being shown up in the chat room. (Optional - Defaults to ?)
* `timeOut` - Timeout in minutes.

{{% alert theme="warning" %}}**retryWithPrompt**{{% /alert %}}


#### Examples
```groovy
retryWithPrompt ([timeOut: 10,
                  stepName: 'Optional']) {
    echo 'I am fine.'
}
```

```groovy
retryWithPrompt ([timeOut: 10,
                  stepName: 'testing']) {
    error 'something wrong.'
}
```

* Classic View - Waiting for User input

{{% image filename="/images/retry_with_prompt.png"%}}