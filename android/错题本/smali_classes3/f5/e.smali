.class public final Lf5/e;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/widget/StemWebView;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/widget/StemWebView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf5/e;->a:Lcom/zykj/mistake/widget/StemWebView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lf5/e;->a:Lcom/zykj/mistake/widget/StemWebView;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/zykj/mistake/widget/StemWebView;->i:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "true"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v1, "false"

    .line 11
    .line 12
    :goto_0
    const-string v2, "(function() {\n    var toolBar = document.querySelector(\'.toolBar\');\n    var body = document.body;\n    var html = document.documentElement;\n    if (toolBar) toolBar.style.display = \'none\';\n    if (body) body.style.paddingBottom = \'0\';\n    if (html) html.style.paddingBottom = \'0\';\n    if (removeTopSpacing) {\n        if (body) body.style.paddingTop = \'0\';\n        if (html) html.style.paddingTop = \'0\';\n        function removeBoundaryWhitespaceTextNodes(element) {\n            if (!element) return;\n            while (element.firstChild &&\n                element.firstChild.nodeType === Node.TEXT_NODE &&\n                element.firstChild.nodeValue.trim().length === 0) {\n                element.removeChild(element.firstChild);\n            }\n            while (element.lastChild &&\n                element.lastChild.nodeType === Node.TEXT_NODE &&\n                element.lastChild.nodeValue.trim().length === 0) {\n                element.removeChild(element.lastChild);\n            }\n        }\n        document.querySelectorAll(\'.qststem\').forEach(function(element) {\n            removeBoundaryWhitespaceTextNodes(element);\n        });\n        var stem = document.querySelector(\'.qststem\');\n        var hasText = stem && stem.textContent.trim().length > 0;\n        var hasMedia = stem && stem.querySelector(\'img, video, audio, canvas, svg, iframe, object, embed, table\');\n        if (stem && !hasText && !hasMedia) {\n            stem.style.display = \'none\';\n            var answers = document.querySelector(\'.answers\');\n            if (answers) answers.style.marginTop = \'0\';\n        }\n    }\n})();"

    .line 13
    .line 14
    const-string v3, "removeTopSpacing"

    .line 15
    .line 16
    invoke-static {v2, v3, v1}, Lkotlin/text/w;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    new-instance v2, Lf5/d;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lf5/d;-><init>(Lcom/zykj/mistake/widget/StemWebView;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/mistake/widget/StemWebView;->getPageFinishListener()Lr6/a;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    .line 41
    .line 42
    sget-object p1, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    .line 43
    .line 44
    const-string v0, "\u9519\u9898\u672c"

    .line 45
    .line 46
    const-string v1, "com.zykj.mistake"

    .line 47
    .line 48
    invoke-virtual {p1, p2, v0, v1}, Lcom/zykj/message/client/MessageClient;->checkUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_3
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 p3, -0x8

    .line 5
    if-eq p2, p3, :cond_1

    .line 6
    .line 7
    const/4 p3, -0x6

    .line 8
    if-eq p2, p3, :cond_1

    .line 9
    .line 10
    const/4 p3, -0x2

    .line 11
    if-eq p2, p3, :cond_1

    .line 12
    .line 13
    const/4 p3, -0x1

    .line 14
    if-eq p2, p3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz p1, :cond_2

    .line 18
    .line 19
    const-string p2, "file:///android_asset/error.html?code=\u7f51\u7edc\u672a\u8fde\u63a5"

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    if-eqz p1, :cond_2

    .line 26
    .line 27
    new-instance p3, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string p4, "file:///android_asset/error.html?code="

    .line 30
    .line 31
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_0
    return-void
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 12

    .line 1
    const-string v0, "text/html"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v2, v1

    .line 15
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "shouldInterceptRequest url -> "

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "webView"

    .line 30
    .line 31
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    if-eqz p2, :cond_4

    .line 35
    .line 36
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    iget-object v3, p0, Lf5/e;->a:Lcom/zykj/mistake/widget/StemWebView;

    .line 49
    .line 50
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v5, "getMethod(...)"

    .line 55
    .line 56
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const-string v5, "toLowerCase(...)"

    .line 66
    .line 67
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v5, "get"

    .line 71
    .line 72
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_4

    .line 77
    .line 78
    const-string v4, "https"

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    invoke-static {v2, v4, v5}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_1

    .line 86
    .line 87
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :cond_1
    const/4 v4, 0x0

    .line 93
    :try_start_0
    new-instance v6, Lcom/zykj/mistake/feature/notebook/detail/z4;

    .line 94
    .line 95
    invoke-direct {v6}, Lcom/zykj/mistake/feature/notebook/detail/z4;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6, v4, v2}, Lcom/zykj/mistake/feature/notebook/detail/z4;->d(Lokhttp3/r;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6}, Lcom/zykj/mistake/feature/notebook/detail/z4;->a()Lokhttp3/r;

    .line 102
    .line 103
    .line 104
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    :catch_0
    move-object v7, v4

    .line 106
    if-eqz v7, :cond_4

    .line 107
    .line 108
    :try_start_1
    iget-object v4, v3, Lcom/zykj/mistake/widget/StemWebView;->c:Lokhttp3/z;

    .line 109
    .line 110
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 111
    .line 112
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v8, "GET"

    .line 116
    .line 117
    new-instance v9, Ljava/util/ArrayList;

    .line 118
    .line 119
    const/16 v10, 0x14

    .line 120
    .line 121
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    move-object v10, v9

    .line 125
    new-instance v9, Lokhttp3/q;

    .line 126
    .line 127
    new-array v11, v5, [Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    check-cast v10, [Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {v9, v10}, Lokhttp3/q;-><init>([Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    sget-object v10, Lp7/c;->a:[B

    .line 139
    .line 140
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    if-eqz v10, :cond_2

    .line 145
    .line 146
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    :goto_1
    move-object v11, v6

    .line 151
    goto :goto_2

    .line 152
    :cond_2
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    invoke-direct {v10, v6}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v10}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    const-string v10, "{\n    Collections.unmodi\u2026(LinkedHashMap(this))\n  }"

    .line 162
    .line 163
    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :goto_2
    new-instance v6, Lokhttp3/c0;

    .line 168
    .line 169
    const/4 v10, 0x0

    .line 170
    invoke-direct/range {v6 .. v11}, Lokhttp3/c0;-><init>(Lokhttp3/r;Ljava/lang/String;Lokhttp3/q;Lokhttp3/g0;Ljava/util/Map;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v6}, Lokhttp3/z;->c(Lokhttp3/c0;)Lokhttp3/internal/connection/i;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v4}, Lokhttp3/internal/connection/i;->h()Lokhttp3/i0;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    const-string v6, "Content-Type"

    .line 182
    .line 183
    invoke-static {v6, v4}, Lokhttp3/i0;->a(Ljava/lang/String;Lokhttp3/i0;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    if-nez v4, :cond_3

    .line 188
    .line 189
    move-object v4, v1

    .line 190
    :cond_3
    invoke-static {v4, v0, v5}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-eqz v4, :cond_4

    .line 195
    .line 196
    iget-object v3, v3, Lcom/zykj/mistake/widget/StemWebView;->b:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v2, v3, v5}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-nez v2, :cond_4

    .line 203
    .line 204
    new-instance v2, Landroid/webkit/WebResourceResponse;

    .line 205
    .line 206
    const-string v3, "UTF-8"

    .line 207
    .line 208
    new-instance v4, Ljava/io/ByteArrayInputStream;

    .line 209
    .line 210
    sget-object v5, Lkotlin/text/a;->a:Ljava/nio/charset/Charset;

    .line 211
    .line 212
    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    const-string v5, "getBytes(...)"

    .line 217
    .line 218
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-direct {v4, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 222
    .line 223
    .line 224
    invoke-direct {v2, v0, v3, v4}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 225
    .line 226
    .line 227
    return-object v2

    .line 228
    :catch_1
    move-exception v0

    .line 229
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 230
    .line 231
    .line 232
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    return-object p1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lf5/e;->a:Lcom/zykj/mistake/widget/StemWebView;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/zykj/mistake/widget/StemWebView;->b:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p2, p1, v0}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x1

    .line 14
    return p1
.end method
