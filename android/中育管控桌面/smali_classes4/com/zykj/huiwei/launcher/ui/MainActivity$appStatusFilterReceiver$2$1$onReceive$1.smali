# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.huiwei.launcher.ui.MainActivity$appStatusFilterReceiver$2$1$onReceive$1"
    f = "MainActivity.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xe1
    }
    m = "invokeSuspend"
    n = {
        "list",
        "$i$a$-runCatching-MainActivity$appStatusFilterReceiver$2$1$onReceive$1$1"
    }
    s = {
        "L$1",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,456:1\n1563#2:457\n1634#2,3:458\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1\n*L\n230#1:457\n230#1:458,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public final synthetic e:Landroid/content/Intent;

.field public final synthetic f:Lcom/zykj/huiwei/launcher/ui/MainActivity;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->e:Landroid/content/Intent;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->f:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->e:Landroid/content/Intent;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->f:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;-><init>(Landroid/content/Intent;Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/List;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_3

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto/16 :goto_7

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->e:Landroid/content/Intent;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->f:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 42
    .line 43
    :try_start_1
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 44
    .line 45
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    const/16 v5, 0x21

    .line 48
    .line 49
    const-string v6, "apps_status_list"

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    if-lt v4, v5, :cond_4

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    :try_start_2
    const-class v4, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-static {p1, v6, v4}, Ly3/m;->a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Ljava/util/ArrayList;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object p1, v7

    .line 66
    :goto_0
    if-eqz p1, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object p1, v7

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    if-eqz p1, :cond_5

    .line 72
    .line 73
    invoke-virtual {p1, v6}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    goto :goto_1

    .line 78
    :cond_5
    move-object p1, v7

    .line 79
    :goto_1
    instance-of v4, p1, Ljava/util/List;

    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    check-cast p1, Ljava/util/List;

    .line 84
    .line 85
    :goto_2
    if-nez p1, :cond_6

    .line 86
    .line 87
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :cond_6
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    const-string v5, "getBaseContext(...)"

    .line 96
    .line 97
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v4}, Lcom/zykj/huiwei/launcher/ext/CommonExtKt;->d(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    new-instance v5, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1;

    .line 105
    .line 106
    invoke-direct {v5, p1, v7}, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1;-><init>(Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 107
    .line 108
    .line 109
    iput-object v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->a:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->b:Ljava/lang/Object;

    .line 112
    .line 113
    iput v2, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->c:I

    .line 114
    .line 115
    iput v3, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1$onReceive$1;->d:I

    .line 116
    .line 117
    invoke-static {v4, v5, p0}, Landroidx/datastore/preferences/core/PreferencesKt;->edit(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    if-ne v4, v0, :cond_7

    .line 122
    .line 123
    return-object v0

    .line 124
    :cond_7
    move-object v0, p1

    .line 125
    :goto_3
    invoke-static {v1}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->D(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Ljava/util/Map;

    .line 134
    .line 135
    if-eqz v1, :cond_a

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Ljava/lang/Iterable;

    .line 142
    .line 143
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    new-instance v5, Ljava/util/ArrayList;

    .line 148
    .line 149
    const/16 v6, 0xa

    .line 150
    .line 151
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_b

    .line 167
    .line 168
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    check-cast v6, Ljava/lang/String;

    .line 173
    .line 174
    new-instance v7, Lcom/zykj/huiwei/launcher/bean/LcAppInfo;

    .line 175
    .line 176
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    check-cast v8, Ljava/lang/Integer;

    .line 181
    .line 182
    if-nez v8, :cond_8

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_8
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-nez v8, :cond_9

    .line 190
    .line 191
    move v8, v3

    .line 192
    goto :goto_6

    .line 193
    :cond_9
    :goto_5
    move v8, v2

    .line 194
    :goto_6
    invoke-direct {v7, v6, v8}, Lcom/zykj/huiwei/launcher/bean/LcAppInfo;-><init>(Ljava/lang/String;Z)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_a
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    :cond_b
    invoke-virtual {p1, v5}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->r(Ljava/util/List;)V

    .line 206
    .line 207
    .line 208
    const-string p1, "-----"

    .line 209
    .line 210
    new-instance v1, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const-string v2, "onReceive:  filterReceiver "

    .line 216
    .line 217
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 239
    goto :goto_8

    .line 240
    :goto_7
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 241
    .line 242
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    :goto_8
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    if-eqz p1, :cond_c

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 257
    .line 258
    .line 259
    :cond_c
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 260
    .line 261
    return-object p1
.end method
