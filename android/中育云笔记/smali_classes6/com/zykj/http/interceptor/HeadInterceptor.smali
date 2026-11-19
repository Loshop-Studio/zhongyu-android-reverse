.class public final Lcom/zykj/http/interceptor/HeadInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field public headerBeanFlow:Lvd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic getHeaderBeanFlow$annotations()V
    .locals 0
    .annotation runtime Lcom/zykj/http/annotation/HeaderBeanFlow;
    .end annotation

    return-void
.end method


# virtual methods
.method public final getHeaderBeanFlow()Lvd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/http/interceptor/HeadInterceptor;->headerBeanFlow:Lvd/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "headerBeanFlow"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public intercept(Lje/s$a;)Lje/y;
    .locals 11

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lje/s$a;->request()Lje/w;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lje/w;->h()Lje/w$a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0}, Lcom/zykj/http/interceptor/HeadInterceptor;->getHeaderBeanFlow()Lvd/l;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v2}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getAppName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    const-string v4, "AppName"

    .line 31
    .line 32
    invoke-virtual {v1, v4, v3}, Lje/w$a;->h(Ljava/lang/String;Ljava/lang/String;)Lje/w$a;

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getVersionCode()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    const-string v4, "AppVersion"

    .line 42
    .line 43
    invoke-virtual {v1, v4, v3}, Lje/w$a;->h(Ljava/lang/String;Ljava/lang/String;)Lje/w$a;

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    new-instance v4, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v5, "Bearer "

    .line 58
    .line 59
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const-string v4, "Authorization"

    .line 70
    .line 71
    invoke-virtual {v1, v4, v3}, Lje/w$a;->h(Ljava/lang/String;Ljava/lang/String;)Lje/w$a;

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    sget-object v3, Lje/r;->k:Lje/r$b;

    .line 81
    .line 82
    invoke-virtual {v3, v2}, Lje/r$b;->f(Ljava/lang/String;)Lje/r;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    invoke-virtual {v2}, Lje/r;->k()Lje/r$a;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0}, Lje/w;->j()Lje/r;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v3}, Lje/r;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    const/4 v3, 0x2

    .line 101
    const/4 v5, 0x0

    .line 102
    const-string v10, "?"

    .line 103
    .line 104
    const/4 v6, 0x0

    .line 105
    invoke-static {v4, v10, v6, v3, v5}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_3

    .line 110
    .line 111
    filled-new-array {v10}, [Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    const/4 v8, 0x6

    .line 116
    const/4 v9, 0x0

    .line 117
    const/4 v6, 0x0

    .line 118
    const/4 v7, 0x0

    .line 119
    invoke-static/range {v4 .. v9}, Lqd/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    const/4 v4, 0x1

    .line 124
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    new-instance v4, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    goto :goto_0

    .line 144
    :cond_3
    const-string v3, ""

    .line 145
    .line 146
    :goto_0
    invoke-virtual {v0}, Lje/w;->j()Lje/r;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Lje/r;->m()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Ljava/lang/Iterable;

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_4

    .line 165
    .line 166
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Lje/r$a;->b(Ljava/lang/String;)Lje/r$a;

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v1, v0}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 192
    .line 193
    .line 194
    :cond_5
    invoke-virtual {v1}, Lje/w$a;->b()Lje/w;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-interface {p1, v0}, Lje/s$a;->a(Lje/w;)Lje/y;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    return-object p1
.end method

.method public final setHeaderBeanFlow(Lvd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/http/interceptor/HeadInterceptor;->headerBeanFlow:Lvd/l;

    .line 7
    .line 8
    return-void
.end method
