.class final Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;->initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$5$1"
    f = "LoginFragment.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3,
        0x4,
        0x4,
        0x5,
        0x5
    }
    l = {
        0x9e,
        0x9f,
        0xa1,
        0xa4,
        0xa4,
        0xa5
    }
    m = "invokeSuspend"
    n = {
        "intent",
        "$i$a$-also-LoginFragment$initView$5$1$1",
        "intent",
        "$i$a$-also-LoginFragment$initView$5$1$1",
        "intent",
        "$i$a$-also-LoginFragment$initView$5$1$1",
        "intent",
        "$i$a$-also-LoginFragment$initView$5$1$1",
        "intent",
        "$i$a$-also-LoginFragment$initView$5$1$1",
        "intent",
        "$i$a$-also-LoginFragment$initView$5$1$1"
    }
    s = {
        "L$2",
        "I$0",
        "L$2",
        "I$0",
        "L$2",
        "I$0",
        "L$2",
        "I$0",
        "L$2",
        "I$0",
        "L$1",
        "I$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:I

.field public i:I

.field public final synthetic j:Ljava/lang/Boolean;

.field public final synthetic k:Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->j:Ljava/lang/Boolean;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->k:Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->j:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->k:Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;-><init>(Ljava/lang/Boolean;Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->i:I

    .line 6
    .line 7
    const-string v2, "LoginFragment"

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroid/content/Context;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Ljava/lang/String;

    .line 33
    .line 34
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, Landroid/content/Intent;

    .line 39
    .line 40
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Landroid/content/Intent;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :catch_0
    move-exception p1

    .line 50
    goto/16 :goto_7

    .line 51
    .line 52
    :pswitch_1
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 53
    .line 54
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Landroid/content/Context;

    .line 57
    .line 58
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v6, Landroid/content/Intent;

    .line 67
    .line 68
    iget-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v7, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    .line 71
    .line 72
    iget-object v8, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v8, Landroid/content/Intent;

    .line 75
    .line 76
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    .line 78
    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :pswitch_2
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 82
    .line 83
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Landroid/content/Context;

    .line 86
    .line 87
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v4, Ljava/lang/String;

    .line 90
    .line 91
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, Landroid/content/Intent;

    .line 94
    .line 95
    iget-object v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v6, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    .line 98
    .line 99
    iget-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Landroid/content/Intent;

    .line 102
    .line 103
    :try_start_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 104
    .line 105
    .line 106
    move-object v8, v7

    .line 107
    move-object v7, v6

    .line 108
    move-object v6, v5

    .line 109
    goto/16 :goto_3

    .line 110
    .line 111
    :pswitch_3
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 112
    .line 113
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v3, Landroid/content/Context;

    .line 116
    .line 117
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v4, Landroid/content/Intent;

    .line 120
    .line 121
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v5, Ljava/lang/String;

    .line 124
    .line 125
    iget-object v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v6, Landroid/content/Intent;

    .line 128
    .line 129
    iget-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v7, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    .line 132
    .line 133
    iget-object v8, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v8, Landroid/content/Intent;

    .line 136
    .line 137
    :try_start_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 138
    .line 139
    .line 140
    goto/16 :goto_2

    .line 141
    .line 142
    :pswitch_4
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 143
    .line 144
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v3, Landroid/content/Context;

    .line 147
    .line 148
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v4, Landroid/content/Intent;

    .line 151
    .line 152
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v5, Ljava/lang/String;

    .line 155
    .line 156
    iget-object v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v6, Landroid/content/Intent;

    .line 159
    .line 160
    iget-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v7, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    .line 163
    .line 164
    iget-object v8, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v8, Landroid/content/Intent;

    .line 167
    .line 168
    :try_start_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 169
    .line 170
    .line 171
    goto/16 :goto_1

    .line 172
    .line 173
    :pswitch_5
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 174
    .line 175
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v3, Landroid/content/Context;

    .line 178
    .line 179
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v4, Landroid/content/Intent;

    .line 182
    .line 183
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v5, Ljava/lang/String;

    .line 186
    .line 187
    iget-object v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v6, Landroid/content/Intent;

    .line 190
    .line 191
    iget-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v7, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    .line 194
    .line 195
    iget-object v8, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v8, Landroid/content/Intent;

    .line 198
    .line 199
    :try_start_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 200
    .line 201
    .line 202
    goto :goto_0

    .line 203
    :pswitch_6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->j:Ljava/lang/Boolean;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-eqz p1, :cond_8

    .line 213
    .line 214
    sget-object p1, Li4/g;->a:Li4/g$a;

    .line 215
    .line 216
    invoke-virtual {p1}, Li4/g$a;->g()Z

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1}, Li4/g$a;->g()Z

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-eqz p1, :cond_7

    .line 224
    .line 225
    :try_start_6
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->k:Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    .line 226
    .line 227
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    new-instance v4, Landroid/content/Intent;

    .line 232
    .line 233
    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 234
    .line 235
    .line 236
    iget-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->k:Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    .line 237
    .line 238
    const-string v1, "com.linspirer.edu.loginapkfinish"

    .line 239
    .line 240
    invoke-virtual {v4, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 241
    .line 242
    .line 243
    const-string v1, "com.android.launcher3"

    .line 244
    .line 245
    invoke-virtual {v4, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 246
    .line 247
    .line 248
    const-string v5, "userid"

    .line 249
    .line 250
    invoke-static {v7}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;->s(Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;)Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    iput-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 259
    .line 260
    iput-object v5, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 265
    .line 266
    const/4 v3, 0x0

    .line 267
    iput v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 268
    .line 269
    const/4 v6, 0x1

    .line 270
    iput v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->i:I

    .line 271
    .line 272
    invoke-virtual {v1, p0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    if-ne v1, v0, :cond_0

    .line 277
    .line 278
    goto/16 :goto_5

    .line 279
    .line 280
    :cond_0
    move v6, v3

    .line 281
    move-object v3, p1

    .line 282
    move-object p1, v1

    .line 283
    move v1, v6

    .line 284
    move-object v6, v4

    .line 285
    move-object v8, v6

    .line 286
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v4, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 289
    .line 290
    .line 291
    const-string v5, "username"

    .line 292
    .line 293
    invoke-static {v7}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;->s(Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;)Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    iput-object v8, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 298
    .line 299
    iput-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 302
    .line 303
    iput-object v5, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 306
    .line 307
    iput-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 308
    .line 309
    iput v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 310
    .line 311
    const/4 v4, 0x2

    .line 312
    iput v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->i:I

    .line 313
    .line 314
    invoke-virtual {p1, p0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->s(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    if-ne p1, v0, :cond_1

    .line 319
    .line 320
    goto/16 :goto_5

    .line 321
    .line 322
    :cond_1
    move-object v4, v6

    .line 323
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 324
    .line 325
    invoke-virtual {v4, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 326
    .line 327
    .line 328
    const-string p1, "schoolid"

    .line 329
    .line 330
    invoke-static {v7}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;->s(Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;)Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    invoke-virtual {v4}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->l()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    if-nez v4, :cond_2

    .line 339
    .line 340
    const-string v4, ""

    .line 341
    .line 342
    :cond_2
    invoke-virtual {v6, p1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 343
    .line 344
    .line 345
    const-string v5, "classname"

    .line 346
    .line 347
    invoke-static {v7}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;->s(Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;)Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    iput-object v8, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 352
    .line 353
    iput-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 354
    .line 355
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    iput-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 360
    .line 361
    iput-object v5, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 362
    .line 363
    iput-object v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 364
    .line 365
    iput-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 366
    .line 367
    iput v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 368
    .line 369
    const/4 v4, 0x3

    .line 370
    iput v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->i:I

    .line 371
    .line 372
    invoke-virtual {p1, p0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->i(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    if-ne p1, v0, :cond_3

    .line 377
    .line 378
    goto/16 :goto_5

    .line 379
    .line 380
    :cond_3
    move-object v4, v6

    .line 381
    :goto_2
    check-cast p1, Ljava/lang/String;

    .line 382
    .line 383
    invoke-virtual {v4, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 384
    .line 385
    .line 386
    invoke-static {v7}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;->s(Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;)Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    iput-object v8, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 393
    .line 394
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    iput-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 399
    .line 400
    iput-object v2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 401
    .line 402
    iput-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 403
    .line 404
    const/4 v4, 0x0

    .line 405
    iput-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 406
    .line 407
    iput v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 408
    .line 409
    const/4 v4, 0x4

    .line 410
    iput v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->i:I

    .line 411
    .line 412
    invoke-virtual {p1, p0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    if-ne p1, v0, :cond_4

    .line 417
    .line 418
    goto :goto_5

    .line 419
    :cond_4
    move-object v4, v2

    .line 420
    :goto_3
    invoke-static {v7}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;->s(Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;)Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    iput-object v8, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 425
    .line 426
    iput-object v7, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 427
    .line 428
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v9

    .line 432
    iput-object v9, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 433
    .line 434
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 435
    .line 436
    iput-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 437
    .line 438
    iput-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 439
    .line 440
    iput v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 441
    .line 442
    const/4 v9, 0x5

    .line 443
    iput v9, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->i:I

    .line 444
    .line 445
    invoke-virtual {v5, p0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->s(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    if-ne v5, v0, :cond_5

    .line 450
    .line 451
    goto :goto_5

    .line 452
    :cond_5
    move-object v10, v5

    .line 453
    move-object v5, p1

    .line 454
    move-object p1, v10

    .line 455
    :goto_4
    invoke-static {v7}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;->s(Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;)Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 456
    .line 457
    .line 458
    move-result-object v9

    .line 459
    invoke-virtual {v9}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->l()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v9

    .line 463
    invoke-static {v7}, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;->s(Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;)Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 464
    .line 465
    .line 466
    move-result-object v7

    .line 467
    iput-object v8, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->a:Ljava/lang/Object;

    .line 468
    .line 469
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v6

    .line 473
    iput-object v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->b:Ljava/lang/Object;

    .line 474
    .line 475
    iput-object v5, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->c:Ljava/lang/Object;

    .line 476
    .line 477
    iput-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->d:Ljava/lang/Object;

    .line 478
    .line 479
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->e:Ljava/lang/Object;

    .line 480
    .line 481
    iput-object v9, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->f:Ljava/lang/Object;

    .line 482
    .line 483
    iput-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->g:Ljava/lang/Object;

    .line 484
    .line 485
    iput v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->h:I

    .line 486
    .line 487
    const/4 v1, 0x6

    .line 488
    iput v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->i:I

    .line 489
    .line 490
    invoke-virtual {v7, p0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->i(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    if-ne v1, v0, :cond_6

    .line 495
    .line 496
    :goto_5
    return-object v0

    .line 497
    :cond_6
    move-object v0, v1

    .line 498
    move-object v1, p1

    .line 499
    move-object p1, v0

    .line 500
    move-object v0, v3

    .line 501
    move-object v3, v5

    .line 502
    move-object v4, v8

    .line 503
    :goto_6
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 513
    .line 514
    .line 515
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 516
    .line 517
    goto :goto_8

    .line 518
    :goto_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    new-instance v0, Ljava/lang/StringBuilder;

    .line 523
    .line 524
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 525
    .line 526
    .line 527
    const-string v1, "\u53d1\u5149\u6ce2\u5f02\u5e38\u5f02\u5e38:"

    .line 528
    .line 529
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    const-string p1, " "

    .line 536
    .line 537
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 545
    .line 546
    .line 547
    move-result p1

    .line 548
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 549
    .line 550
    .line 551
    goto :goto_8

    .line 552
    :cond_7
    sget-object p1, Lcom/zykj/huiwei/launcher/ui/fragment/a;->a:Lcom/zykj/huiwei/launcher/ui/fragment/a$a;

    .line 553
    .line 554
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/ui/fragment/a$a;->a()Landroidx/navigation/NavDirections;

    .line 555
    .line 556
    .line 557
    move-result-object p1

    .line 558
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1;->k:Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;

    .line 559
    .line 560
    invoke-static {v0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 565
    .line 566
    .line 567
    :cond_8
    :goto_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 568
    .line 569
    return-object p1

    .line 570
    nop

    .line 571
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
