.class final Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/Triple<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lcom/zykj/huiwei/launcher/bean/LcAppInfo;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lcom/zykj/huiwei/launcher/bean/LcAppInfo;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;",
        ">;>;",
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
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00040\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "pair",
        "Lkotlin/Triple;",
        "",
        "Lcom/zykj/huiwei/launcher/bean/LcAppInfo;",
        "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;"
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
    c = "com.zykj.huiwei.launcher.ui.MainActivity$initLC$6$1"
    f = "MainActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,456:1\n774#2:457\n865#2:458\n295#2,2:459\n295#2,2:461\n866#2:463\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1\n*L\n351#1:457\n351#1:458\n358#1:459,2\n360#1:461,2\n351#1:463\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/ui/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;->c:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;->c:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    invoke-direct {v0, v1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;->a(Lkotlin/Triple;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlin/Triple;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_b

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;->c:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->D(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->g()Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/Iterable;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1;->c:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 32
    .line 33
    new-instance v3, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_a

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    move-object v5, v4

    .line 53
    check-cast v5, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 54
    .line 55
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getPackageName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    const/4 v7, 0x0

    .line 68
    if-nez v6, :cond_9

    .line 69
    .line 70
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getActivityName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    const-string v8, "com.innofidei.guardsecure.dataclean.PullNewsActivity"

    .line 75
    .line 76
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_8

    .line 81
    .line 82
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getActivityName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    const-string v8, "com.android.launcher3.activity.PullNewsActivity"

    .line 87
    .line 88
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-nez v6, :cond_8

    .line 93
    .line 94
    invoke-virtual {v0}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    check-cast v6, Ljava/lang/Iterable;

    .line 99
    .line 100
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    const/4 v9, 0x0

    .line 109
    if-eqz v8, :cond_2

    .line 110
    .line 111
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    move-object v10, v8

    .line 116
    check-cast v10, Lcom/zykj/huiwei/launcher/bean/LcAppInfo;

    .line 117
    .line 118
    invoke-virtual {v10}, Lcom/zykj/huiwei/launcher/bean/LcAppInfo;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getActivityName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    if-nez v11, :cond_3

    .line 131
    .line 132
    invoke-virtual {v10}, Lcom/zykj/huiwei/launcher/bean/LcAppInfo;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getPackageName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    if-eqz v10, :cond_1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_2
    move-object v8, v9

    .line 148
    :cond_3
    :goto_1
    check-cast v8, Lcom/zykj/huiwei/launcher/bean/LcAppInfo;

    .line 149
    .line 150
    if-nez v8, :cond_6

    .line 151
    .line 152
    invoke-virtual {v0}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, Ljava/lang/Iterable;

    .line 157
    .line 158
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-eqz v8, :cond_5

    .line 167
    .line 168
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    move-object v10, v8

    .line 173
    check-cast v10, Lcom/zykj/huiwei/launcher/bean/LcAppInfo;

    .line 174
    .line 175
    invoke-virtual {v10}, Lcom/zykj/huiwei/launcher/bean/LcAppInfo;->getName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getPackageName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    if-eqz v10, :cond_4

    .line 188
    .line 189
    move-object v9, v8

    .line 190
    :cond_5
    move-object v8, v9

    .line 191
    check-cast v8, Lcom/zykj/huiwei/launcher/bean/LcAppInfo;

    .line 192
    .line 193
    :cond_6
    if-eqz v8, :cond_7

    .line 194
    .line 195
    invoke-virtual {v8}, Lcom/zykj/huiwei/launcher/bean/LcAppInfo;->getVisible()Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    goto :goto_2

    .line 200
    :cond_7
    move v5, v7

    .line 201
    :goto_2
    if-eqz v5, :cond_9

    .line 202
    .line 203
    :cond_8
    const/4 v7, 0x1

    .line 204
    :cond_9
    if-eqz v7, :cond_0

    .line 205
    .line 206
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_a
    invoke-interface {p1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p1

    .line 217
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 218
    .line 219
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 220
    .line 221
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p1
.end method
