.class public final Lcom/zykj/http/interceptor/HeadInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr2/u;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/http/interceptor/HeadInterceptor$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\t\u0008\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/zykj/http/interceptor/HeadInterceptor;",
        "Lr2/u;",
        "Lr2/u$a;",
        "chain",
        "Lr2/a0;",
        "intercept",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "headerLiveData",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "getHeaderLiveData",
        "()Lcom/zykj/http/bean/HeaderLiveData;",
        "setHeaderLiveData",
        "(Lcom/zykj/http/bean/HeaderLiveData;)V",
        "<init>",
        "()V",
        "Companion",
        "a",
        "http_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final APP_NAME_KEY:Ljava/lang/String; = "AppName"

.field public static final APP_VERSION_KEY:Ljava/lang/String; = "AppVersion"

.field public static final AUTH_KEY:Ljava/lang/String; = "Authorization"

.field public static final Companion:Lcom/zykj/http/interceptor/HeadInterceptor$a;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field public headerLiveData:Lcom/zykj/http/bean/HeaderLiveData;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/http/interceptor/HeadInterceptor$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/http/interceptor/HeadInterceptor$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/http/interceptor/HeadInterceptor;->Companion:Lcom/zykj/http/interceptor/HeadInterceptor$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "this::class.java.name"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/zykj/http/interceptor/HeadInterceptor;->TAG:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getTAG$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/http/interceptor/HeadInterceptor;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final getHeaderLiveData()Lcom/zykj/http/bean/HeaderLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/http/interceptor/HeadInterceptor;->headerLiveData:Lcom/zykj/http/bean/HeaderLiveData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "headerLiveData"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public intercept(Lr2/u$a;)Lr2/a0;
    .locals 13

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lr2/u$a;->S()Lr2/y;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lr2/y;->h()Lr2/y$a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0}, Lcom/zykj/http/interceptor/HeadInterceptor;->getHeaderLiveData()Lcom/zykj/http/bean/HeaderLiveData;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto :goto_4

    .line 27
    :cond_0
    sget-object v3, Lcom/zykj/http/interceptor/HeadInterceptor;->TAG:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getAppName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-string v4, "AppName"

    .line 44
    .line 45
    invoke-virtual {v1, v4, v3}, Lr2/y$a;->c(Ljava/lang/String;Ljava/lang/String;)Lr2/y$a;

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getVersionCode()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const-string v4, "AppVersion"

    .line 56
    .line 57
    invoke-virtual {v1, v4, v3}, Lr2/y$a;->c(Ljava/lang/String;Ljava/lang/String;)Lr2/y$a;

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const/4 v4, 0x0

    .line 65
    const/4 v5, 0x1

    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-lez v6, :cond_4

    .line 74
    .line 75
    move v6, v5

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    move v6, v4

    .line 78
    :goto_2
    if-eqz v6, :cond_5

    .line 79
    .line 80
    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    xor-int/2addr v6, v5

    .line 85
    if-eqz v6, :cond_5

    .line 86
    .line 87
    const-string v6, "Bearer "

    .line 88
    .line 89
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    const-string v6, "Authorization"

    .line 94
    .line 95
    invoke-virtual {v1, v6, v3}, Lr2/y$a;->c(Ljava/lang/String;Ljava/lang/String;)Lr2/y$a;

    .line 96
    .line 97
    .line 98
    :cond_5
    :goto_3
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-nez v2, :cond_6

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    sget-object v3, Lr2/t;->l:Lr2/t$b;

    .line 106
    .line 107
    invoke-virtual {v3, v2}, Lr2/t$b;->f(Ljava/lang/String;)Lr2/t;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-nez v2, :cond_7

    .line 112
    .line 113
    :goto_4
    invoke-virtual {v1}, Lr2/y$a;->b()Lr2/y;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {p1, v0}, Lr2/u$a;->a(Lr2/y;)Lr2/a0;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :cond_7
    invoke-virtual {v2}, Lr2/t;->k()Lr2/t$a;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v0}, Lr2/y;->j()Lr2/t;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v3}, Lr2/t;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    const/4 v3, 0x2

    .line 135
    const/4 v7, 0x0

    .line 136
    const-string v12, "?"

    .line 137
    .line 138
    invoke-static {v6, v12, v4, v3, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_8

    .line 143
    .line 144
    filled-new-array {v12}, [Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    const/4 v8, 0x0

    .line 149
    const/4 v9, 0x0

    .line 150
    const/4 v10, 0x6

    .line 151
    const/4 v11, 0x0

    .line 152
    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-static {v12, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    goto :goto_5

    .line 165
    :cond_8
    const-string v3, ""

    .line 166
    .line 167
    :goto_5
    invoke-virtual {v0}, Lr2/y;->j()Lr2/t;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Lr2/t;->m()Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_9

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    check-cast v4, Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v2, v4}, Lr2/t$a;->b(Ljava/lang/String;)Lr2/t$a;

    .line 192
    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v1, v0}, Lr2/y$a;->h(Ljava/lang/String;)Lr2/y$a;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Lr2/y$a;->b()Lr2/y;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-interface {p1, v0}, Lr2/u$a;->a(Lr2/y;)Lr2/a0;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    return-object p1
.end method

.method public final setHeaderLiveData(Lcom/zykj/http/bean/HeaderLiveData;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/http/interceptor/HeadInterceptor;->headerLiveData:Lcom/zykj/http/bean/HeaderLiveData;

    .line 7
    .line 8
    return-void
.end method
