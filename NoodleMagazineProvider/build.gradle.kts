version = 4


cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them

    description = "Full length"
    authors = listOf("dsh")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "Movie",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=noodlemagazine.com/&sz=%size%"
}
