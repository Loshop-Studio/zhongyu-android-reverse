# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/MainActivity;->f0()V
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
    c = "com.zykj.huiwei.launcher.ui.MainActivity$tryGetSn$1"
    f = "MainActivity.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x196,
        0x1a0
    }
    m = "invokeSuspend"
    n = {
        "it",
        "$i$a$-repeat-MainActivity$tryGetSn$1$1",
        "it",
        "$i$a$-repeat-MainActivity$tryGetSn$1$1"
    }
    s = {
        "I$2",
        "I$3",
        "I$2",
        "I$3"
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Ljava/lang/Object;

.field public f:I

.field public final synthetic g:Lcom/zykj/huiwei/launcher/ui/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->g:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->g:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    invoke-direct {p1, v0, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->f:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->b:I

    .line 17
    .line 18
    iget v5, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->a:I

    .line 19
    .line 20
    iget-object v6, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v6, Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v6

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->d:I

    .line 39
    .line 40
    iget v5, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->c:I

    .line 41
    .line 42
    iget v6, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->b:I

    .line 43
    .line 44
    iget v7, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->a:I

    .line 45
    .line 46
    iget-object v8, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v8, Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move v10, v5

    .line 54
    move v5, v1

    .line 55
    move v1, v6

    .line 56
    move v6, v10

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->g:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    move v5, v2

    .line 65
    :goto_0
    if-ge v5, v1, :cond_8

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    const-string v7, "getBaseContext(...)"

    .line 72
    .line 73
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v6}, Lcom/zykj/huiwei/launcher/ext/CommonExtKt;->d(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-interface {v6}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->e:Ljava/lang/Object;

    .line 85
    .line 86
    iput v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->a:I

    .line 87
    .line 88
    iput v5, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->b:I

    .line 89
    .line 90
    iput v5, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->c:I

    .line 91
    .line 92
    iput v2, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->d:I

    .line 93
    .line 94
    iput v4, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->f:I

    .line 95
    .line 96
    invoke-static {v6, p0}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    if-ne v6, v0, :cond_3

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_3
    move-object v8, p1

    .line 104
    move v7, v1

    .line 105
    move v1, v5

    .line 106
    move-object p1, v6

    .line 107
    move v5, v2

    .line 108
    move v6, v1

    .line 109
    :goto_1
    check-cast p1, Landroidx/datastore/preferences/core/Preferences;

    .line 110
    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    const-string v9, "deviceId"

    .line 114
    .line 115
    invoke-static {v9}, Landroidx/datastore/preferences/core/PreferencesKeys;->stringKey(Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences$Key;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {p1, v9}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Ljava/lang/String;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    const/4 p1, 0x0

    .line 127
    :goto_2
    if-eqz p1, :cond_6

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-nez p1, :cond_5

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_6
    :goto_3
    new-instance p1, Landroid/content/Intent;

    .line 140
    .line 141
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v9, "com.linspirer.edu.getdevicesn"

    .line 145
    .line 146
    invoke-virtual {p1, v9}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    const-string v9, "com.android.launcher3"

    .line 150
    .line 151
    invoke-virtual {p1, v9}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v8, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 155
    .line 156
    .line 157
    iput-object v8, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->e:Ljava/lang/Object;

    .line 158
    .line 159
    iput v7, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->a:I

    .line 160
    .line 161
    iput v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->b:I

    .line 162
    .line 163
    iput v6, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->c:I

    .line 164
    .line 165
    iput v5, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->d:I

    .line 166
    .line 167
    iput v3, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;->f:I

    .line 168
    .line 169
    const-wide/16 v5, 0xbb8

    .line 170
    .line 171
    invoke-static {v5, v6, p0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-ne p1, v0, :cond_7

    .line 176
    .line 177
    :goto_4
    return-object v0

    .line 178
    :cond_7
    move v5, v7

    .line 179
    move-object p1, v8

    .line 180
    :goto_5
    add-int/2addr v1, v4

    .line 181
    move v10, v5

    .line 182
    move v5, v1

    .line 183
    move v1, v10

    .line 184
    goto :goto_0

    .line 185
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p1
.end method
