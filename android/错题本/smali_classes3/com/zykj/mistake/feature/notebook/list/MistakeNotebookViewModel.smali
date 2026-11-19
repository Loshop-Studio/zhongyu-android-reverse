# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class public final Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;
.super Landroidx/lifecycle/AndroidViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;",
        "Landroidx/lifecycle/AndroidViewModel;",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Landroid/app/Application;)V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,845:1\n230#2,5:846\n230#2,5:851\n230#2,5:856\n230#2,5:861\n230#2,5:866\n230#2,3:871\n233#2,2:876\n230#2,5:878\n230#2,5:883\n230#2,5:888\n230#2,5:893\n230#2,5:898\n230#2,5:903\n230#2,5:908\n230#2,5:924\n230#2,5:929\n230#2,5:934\n230#2,5:943\n230#2,5:948\n230#2,5:957\n230#2,5:962\n230#2,5:967\n230#2,5:972\n230#2,5:977\n230#2,3:1008\n233#2,2:1016\n230#2,5:1047\n230#2,5:1056\n230#2,3:1061\n233#2,2:1067\n230#2,3:1069\n233#2,2:1076\n230#2,5:1078\n295#3,2:874\n360#3,7:913\n1563#3:920\n1634#3,3:921\n1563#3:939\n1634#3,3:940\n1563#3:953\n1634#3,3:954\n1788#3,4:982\n1491#3:986\n1516#3,3:987\n1519#3,3:997\n1563#3:1003\n1634#3,3:1004\n295#3,2:1011\n827#3:1013\n855#3,2:1014\n1491#3:1018\n1516#3,3:1019\n1519#3,3:1029\n1563#3:1035\n1634#3,3:1036\n774#3:1040\n865#3,2:1041\n1563#3:1043\n1634#3,3:1044\n1563#3:1052\n1634#3,3:1053\n827#3:1064\n855#3,2:1065\n1563#3:1072\n1634#3,3:1073\n382#4,7:990\n382#4,7:1022\n126#5:1000\n153#5,2:1001\n155#5:1007\n126#5:1032\n153#5,2:1033\n155#5:1039\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel\n*L\n77#1:846,5\n82#1:851,5\n117#1:856,5\n125#1:861,5\n133#1:866,5\n149#1:871,3\n149#1:876,2\n167#1:878,5\n177#1:883,5\n180#1:888,5\n191#1:893,5\n202#1:898,5\n213#1:903,5\n248#1:908,5\n287#1:924,5\n347#1:929,5\n359#1:934,5\n406#1:943,5\n409#1:948,5\n438#1:957,5\n443#1:962,5\n501#1:967,5\n503#1:972,5\n511#1:977,5\n561#1:1008,3\n561#1:1016,2\n317#1:1047,5\n327#1:1056,5\n544#1:1061,3\n544#1:1067,2\n595#1:1069,3\n595#1:1076,2\n618#1:1078,5\n150#1:874,2\n253#1:913,7\n256#1:920\n256#1:921,3\n398#1:939\n398#1:940,3\n434#1:953\n434#1:954,3\n532#1:982,4\n533#1:986\n533#1:987,3\n533#1:997,3\n536#1:1003\n536#1:1004,3\n562#1:1011,2\n570#1:1013\n570#1:1014,2\n580#1:1018\n580#1:1019,3\n580#1:1029,3\n583#1:1035\n583#1:1036,3\n792#1:1040\n792#1:1041,2\n307#1:1043\n307#1:1044,3\n326#1:1052\n326#1:1053,3\n548#1:1064\n548#1:1065,2\n597#1:1072\n597#1:1073,3\n533#1:990,7\n580#1:1022,7\n533#1:1000\n533#1:1001,2\n533#1:1007\n580#1:1032\n580#1:1033,2\n580#1:1039\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/mistake/data/a;

.field public final b:Lcom/zykj/mistake/data/a;

.field public final c:Lo2/a;

.field public final d:Lkotlinx/coroutines/flow/n0;

.field public final e:Lkotlinx/coroutines/flow/a0;

.field public final f:Lkotlinx/coroutines/channels/b;

.field public final g:Lkotlinx/coroutines/flow/c;

.field public h:Lcom/zykj/mistake/entity/req/MistakeListReq;

.field public i:Lkotlinx/coroutines/k1;

.field public j:Lkotlinx/coroutines/k1;

.field public k:I


# direct methods
# RE I/O 读取布尔偏好（SharedPreferences.getBoolean）。
.method public constructor <init>(Landroid/app/Application;)V
    .locals 3
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/lifecycle/AndroidViewModel;-><init>(Landroid/app/Application;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/zykj/mistake/data/a;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lcom/zykj/mistake/data/a;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->a:Lcom/zykj/mistake/data/a;

    .line 16
    .line 17
    new-instance v0, Lcom/zykj/mistake/data/a;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Lcom/zykj/mistake/data/a;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->b:Lcom/zykj/mistake/data/a;

    .line 24
    .line 25
    new-instance v0, Lo2/a;

    .line 26
    .line 27
    const/16 v1, 0xa

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lo2/a;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c:Lo2/a;

    .line 33
    .line 34
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 35
    .line 36
    const-string v1, "zykjMistake"

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v1, "SP_CONTACT_MODE"

    .line 44
    .line 45
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/list/e1;-><init>(Z)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 57
    .line 58
    new-instance v0, Lkotlinx/coroutines/flow/a0;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->e:Lkotlinx/coroutines/flow/a0;

    .line 64
    .line 65
    const/4 p1, 0x7

    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-static {v2, p1, v0}, Lkotlinx/coroutines/channels/k;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/b;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->f:Lkotlinx/coroutines/channels/b;

    .line 72
    .line 73
    invoke-static {p1}, Lkotlinx/coroutines/flow/h;->l(Lkotlinx/coroutines/channels/b;)Lkotlinx/coroutines/flow/c;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->g:Lkotlinx/coroutines/flow/c;

    .line 78
    .line 79
    new-instance p1, Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 80
    .line 81
    invoke-direct {p1}, Lcom/zykj/mistake/entity/req/MistakeListReq;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 85
    .line 86
    return-void
.end method

.method public static final a(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/data/c;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 6
    .line 7
    instance-of v3, v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v1

    .line 12
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v5, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    if-ne v5, v6, :cond_1

    .line 41
    .line 42
    iget-object v4, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, Ljava/util/List;

    .line 45
    .line 46
    iget-object v3, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Lcom/zykj/mistake/data/c;

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    check-cast v1, Lkotlin/Result;

    .line 54
    .line 55
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$2;

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    move-object/from16 v7, p1

    .line 75
    .line 76
    move-object/from16 v8, p2

    .line 77
    .line 78
    invoke-direct {v1, v0, v7, v8, v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$2;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/data/c;Ljava/util/List;Lh6/c;)V

    .line 79
    .line 80
    .line 81
    iput-object v5, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;->L$0:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v5, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    iput v6, v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$appendToNewCollection$1;->label:I

    .line 86
    .line 87
    invoke-static {v1, v3}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-ne v1, v4, :cond_3

    .line 92
    .line 93
    return-object v4

    .line 94
    :cond_3
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_4

    .line 99
    .line 100
    move-object v3, v1

    .line 101
    check-cast v3, Lcom/zykj/mistake/network/ApiResp;

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->b()V

    .line 104
    .line 105
    .line 106
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 107
    .line 108
    const-string v4, "\u5df2\u52a0\u5165\u9519\u9898\u96c6"

    .line 109
    .line 110
    invoke-direct {v3, v4}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v3}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-eqz v1, :cond_9

    .line 121
    .line 122
    :cond_5
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    move-object v4, v3

    .line 127
    check-cast v4, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 128
    .line 129
    const/16 v27, 0x0

    .line 130
    .line 131
    const v28, 0x1bfffff

    .line 132
    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v7, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    const/4 v9, 0x0

    .line 139
    const/4 v10, 0x0

    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    const/4 v13, 0x0

    .line 143
    const/4 v14, 0x0

    .line 144
    const/4 v15, 0x0

    .line 145
    const/16 v16, 0x0

    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    const/16 v18, 0x0

    .line 150
    .line 151
    const/16 v19, 0x0

    .line 152
    .line 153
    const/16 v20, 0x0

    .line 154
    .line 155
    const/16 v21, 0x0

    .line 156
    .line 157
    const/16 v22, 0x0

    .line 158
    .line 159
    const/16 v23, 0x0

    .line 160
    .line 161
    const/16 v24, 0x0

    .line 162
    .line 163
    const/16 v25, 0x0

    .line 164
    .line 165
    const/16 v26, 0x0

    .line 166
    .line 167
    invoke-static/range {v4 .. v28}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {v2, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_5

    .line 176
    .line 177
    invoke-static {v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d(Ljava/lang/Throwable;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-eqz v3, :cond_7

    .line 182
    .line 183
    :cond_6
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    move-object v3, v0

    .line 188
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 189
    .line 190
    const/16 v26, 0x1

    .line 191
    .line 192
    const v27, 0xffffff

    .line 193
    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    const/4 v5, 0x0

    .line 197
    const/4 v6, 0x0

    .line 198
    const/4 v7, 0x0

    .line 199
    const/4 v8, 0x0

    .line 200
    const/4 v9, 0x0

    .line 201
    const/4 v10, 0x0

    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v12, 0x0

    .line 204
    const/4 v13, 0x0

    .line 205
    const/4 v14, 0x0

    .line 206
    const/4 v15, 0x0

    .line 207
    const/16 v16, 0x0

    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const/16 v18, 0x0

    .line 212
    .line 213
    const/16 v19, 0x0

    .line 214
    .line 215
    const/16 v20, 0x0

    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    const/16 v22, 0x0

    .line 220
    .line 221
    const/16 v23, 0x0

    .line 222
    .line 223
    const/16 v24, 0x0

    .line 224
    .line 225
    const/16 v25, 0x0

    .line 226
    .line 227
    invoke-static/range {v3 .. v27}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v2, v0, v1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_6

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_7
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    if-nez v1, :cond_8

    .line 245
    .line 246
    const-string v1, ""

    .line 247
    .line 248
    :cond_8
    invoke-direct {v2, v1}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 252
    .line 253
    .line 254
    :cond_9
    :goto_2
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 255
    .line 256
    return-object v0
.end method

.method public static d(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    instance-of v0, p0, Lcom/zykj/mistake/data/CollectionLimitException;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const-string p0, ""

    .line 12
    .line 13
    :cond_0
    const-string v0, "\u5355\u9519\u9898\u96c6\u6700\u591a\u5305\u542b 100 \u9053\u9519\u9898\uff0c\u8bf7\u53d6\u6d88\u540e\u91cd\u8bd5"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, v0, v1}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v1

    .line 24
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method public static g(Lcom/zykj/mistake/feature/notebook/list/e1;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Lp4/b;

    .line 24
    .line 25
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    .line 26
    .line 27
    iget-object v3, v3, Lp4/b;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final b()V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 11
    .line 12
    sget-object v12, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 13
    .line 14
    const/16 v26, 0x0

    .line 15
    .line 16
    const v27, 0x100bcff

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v13, 0x0

    .line 28
    const/4 v14, 0x0

    .line 29
    const/4 v15, 0x0

    .line 30
    const/16 v16, 0x0

    .line 31
    .line 32
    const/16 v17, 0x0

    .line 33
    .line 34
    const/16 v20, 0x0

    .line 35
    .line 36
    const/16 v21, 0x0

    .line 37
    .line 38
    const-string v22, ""

    .line 39
    .line 40
    const-string v23, ""

    .line 41
    .line 42
    const/16 v24, 0x0

    .line 43
    .line 44
    const/16 v25, 0x0

    .line 45
    .line 46
    move-object/from16 v18, v12

    .line 47
    .line 48
    move-object/from16 v19, v12

    .line 49
    .line 50
    invoke-static/range {v3 .. v27}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    return-void
.end method

.method public final c(Lcom/zykj/mistake/feature/notebook/list/d1;)V
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/b1;->a:Lcom/zykj/mistake/feature/notebook/list/b1;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const-string v3, "SP_CONTACT_MODE"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    iget-object v6, v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/lifecycle/AndroidViewModel;->getApplication()Landroid/app/Application;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0, v3, v4}, Lcom/zykj/mistake/utils/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    xor-int/lit8 v10, v0, 0x1

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/lifecycle/AndroidViewModel;->getApplication()Landroid/app/Application;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0, v3, v10}, Lcom/zykj/mistake/utils/d;->e(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    invoke-static {v10}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v2, 0x4

    .line 41
    const-string v3, "MistakeListPracticeMode"

    .line 42
    .line 43
    invoke-static {v2, v3, v0}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    move-object v7, v0

    .line 51
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 52
    .line 53
    const/16 v30, 0x0

    .line 54
    .line 55
    const v31, 0x1fffffb

    .line 56
    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v11, 0x0

    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    const/4 v15, 0x0

    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    const/16 v17, 0x0

    .line 68
    .line 69
    const/16 v18, 0x0

    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    const/16 v20, 0x0

    .line 74
    .line 75
    const/16 v21, 0x0

    .line 76
    .line 77
    const/16 v22, 0x0

    .line 78
    .line 79
    const/16 v23, 0x0

    .line 80
    .line 81
    const/16 v24, 0x0

    .line 82
    .line 83
    const/16 v25, 0x0

    .line 84
    .line 85
    const/16 v26, 0x0

    .line 86
    .line 87
    const/16 v27, 0x0

    .line 88
    .line 89
    const/16 v28, 0x0

    .line 90
    .line 91
    const/16 v29, 0x0

    .line 92
    .line 93
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_0

    .line 102
    .line 103
    goto/16 :goto_18

    .line 104
    .line 105
    :cond_1
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/a1;->a:Lcom/zykj/mistake/feature/notebook/list/a1;

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_3

    .line 112
    .line 113
    :cond_2
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    move-object v7, v0

    .line 118
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 119
    .line 120
    invoke-virtual {v1}, Landroidx/lifecycle/AndroidViewModel;->getApplication()Landroid/app/Application;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v2, v3, v4}, Lcom/zykj/mistake/utils/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    const/16 v30, 0x0

    .line 129
    .line 130
    const v31, 0x1fffffb

    .line 131
    .line 132
    .line 133
    const/4 v8, 0x0

    .line 134
    const/4 v9, 0x0

    .line 135
    const/4 v11, 0x0

    .line 136
    const/4 v12, 0x0

    .line 137
    const/4 v13, 0x0

    .line 138
    const/4 v14, 0x0

    .line 139
    const/4 v15, 0x0

    .line 140
    const/16 v16, 0x0

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    const/16 v18, 0x0

    .line 145
    .line 146
    const/16 v19, 0x0

    .line 147
    .line 148
    const/16 v20, 0x0

    .line 149
    .line 150
    const/16 v21, 0x0

    .line 151
    .line 152
    const/16 v22, 0x0

    .line 153
    .line 154
    const/16 v23, 0x0

    .line 155
    .line 156
    const/16 v24, 0x0

    .line 157
    .line 158
    const/16 v25, 0x0

    .line 159
    .line 160
    const/16 v26, 0x0

    .line 161
    .line 162
    const/16 v27, 0x0

    .line 163
    .line 164
    const/16 v28, 0x0

    .line 165
    .line 166
    const/16 v29, 0x0

    .line 167
    .line 168
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_2

    .line 177
    .line 178
    goto/16 :goto_18

    .line 179
    .line 180
    :cond_3
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/a0;->a:Lcom/zykj/mistake/feature/notebook/list/a0;

    .line 181
    .line 182
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    const/4 v7, 0x3

    .line 187
    const/4 v8, 0x0

    .line 188
    if-eqz v2, :cond_4

    .line 189
    .line 190
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$dispatch$3;

    .line 195
    .line 196
    invoke-direct {v2, v1, v8}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$dispatch$3;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v0, v8, v8, v2, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_4
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/v0;->a:Lcom/zykj/mistake/feature/notebook/list/v0;

    .line 204
    .line 205
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz v2, :cond_5

    .line 210
    .line 211
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$dispatch$4;

    .line 216
    .line 217
    invoke-direct {v2, v1, v8}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$dispatch$4;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v0, v8, v8, v2, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_5
    instance-of v2, v0, Lcom/zykj/mistake/feature/notebook/list/z;

    .line 225
    .line 226
    if-eqz v2, :cond_a

    .line 227
    .line 228
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/z;

    .line 229
    .line 230
    iget v0, v0, Lcom/zykj/mistake/feature/notebook/list/z;->a:I

    .line 231
    .line 232
    iget v2, v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->k:I

    .line 233
    .line 234
    if-ne v2, v0, :cond_6

    .line 235
    .line 236
    goto/16 :goto_18

    .line 237
    .line 238
    :cond_6
    iput v0, v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->k:I

    .line 239
    .line 240
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->i:Lkotlinx/coroutines/k1;

    .line 241
    .line 242
    if-eqz v0, :cond_7

    .line 243
    .line 244
    invoke-virtual {v0, v8}, Lkotlinx/coroutines/c1;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 245
    .line 246
    .line 247
    :cond_7
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->j:Lkotlinx/coroutines/k1;

    .line 248
    .line 249
    if-eqz v0, :cond_8

    .line 250
    .line 251
    invoke-virtual {v0, v8}, Lkotlinx/coroutines/c1;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 252
    .line 253
    .line 254
    :cond_8
    new-instance v0, Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 255
    .line 256
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/MistakeListReq;-><init>()V

    .line 257
    .line 258
    .line 259
    iput-object v0, v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 260
    .line 261
    :cond_9
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    move-object v2, v0

    .line 266
    check-cast v2, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 267
    .line 268
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 269
    .line 270
    invoke-virtual {v1}, Landroidx/lifecycle/AndroidViewModel;->getApplication()Landroid/app/Application;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    invoke-static {v7, v3, v4}, Lcom/zykj/mistake/utils/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    invoke-direct {v2, v7}, Lcom/zykj/mistake/feature/notebook/list/e1;-><init>(Z)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_9

    .line 286
    .line 287
    invoke-virtual {v1, v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->f(Z)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v4, v4, v4}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->e(ZZZ)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_a
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/w0;->a:Lcom/zykj/mistake/feature/notebook/list/w0;

    .line 295
    .line 296
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-eqz v2, :cond_b

    .line 301
    .line 302
    invoke-virtual {v1, v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->f(Z)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_b
    instance-of v2, v0, Lcom/zykj/mistake/feature/notebook/list/x0;

    .line 307
    .line 308
    if-eqz v2, :cond_17

    .line 309
    .line 310
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/x0;

    .line 311
    .line 312
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/list/x0;->a:I

    .line 313
    .line 314
    iget-boolean v3, v0, Lcom/zykj/mistake/feature/notebook/list/x0;->b:Z

    .line 315
    .line 316
    :cond_c
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    move-object v9, v0

    .line 321
    check-cast v9, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 322
    .line 323
    iget-object v7, v9, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 324
    .line 325
    iget v10, v9, Lcom/zykj/mistake/feature/notebook/list/e1;->b:I

    .line 326
    .line 327
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    :cond_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    if-eqz v11, :cond_e

    .line 336
    .line 337
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v11

    .line 341
    move-object v12, v11

    .line 342
    check-cast v12, Lp4/b;

    .line 343
    .line 344
    iget v12, v12, Lp4/b;->c:I

    .line 345
    .line 346
    if-ne v12, v2, :cond_d

    .line 347
    .line 348
    goto :goto_0

    .line 349
    :cond_e
    move-object v11, v8

    .line 350
    :goto_0
    check-cast v11, Lp4/b;

    .line 351
    .line 352
    iget v7, v9, Lcom/zykj/mistake/feature/notebook/list/e1;->a:I

    .line 353
    .line 354
    sub-int/2addr v7, v5

    .line 355
    if-gez v7, :cond_f

    .line 356
    .line 357
    move v7, v4

    .line 358
    :cond_f
    if-eqz v11, :cond_10

    .line 359
    .line 360
    iget-boolean v12, v11, Lp4/b;->m:Z

    .line 361
    .line 362
    goto :goto_1

    .line 363
    :cond_10
    move v12, v3

    .line 364
    :goto_1
    if-eqz v12, :cond_11

    .line 365
    .line 366
    add-int/lit8 v10, v10, -0x1

    .line 367
    .line 368
    if-gez v10, :cond_11

    .line 369
    .line 370
    move v10, v4

    .line 371
    :cond_11
    iget-object v12, v9, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 372
    .line 373
    new-instance v13, Ljava/util/ArrayList;

    .line 374
    .line 375
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 376
    .line 377
    .line 378
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 379
    .line 380
    .line 381
    move-result-object v12

    .line 382
    :cond_12
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 383
    .line 384
    .line 385
    move-result v14

    .line 386
    if-eqz v14, :cond_14

    .line 387
    .line 388
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v14

    .line 392
    move-object v15, v14

    .line 393
    check-cast v15, Lp4/b;

    .line 394
    .line 395
    iget v15, v15, Lp4/b;->c:I

    .line 396
    .line 397
    if-ne v15, v2, :cond_13

    .line 398
    .line 399
    move v15, v5

    .line 400
    goto :goto_3

    .line 401
    :cond_13
    move v15, v4

    .line 402
    :goto_3
    if-nez v15, :cond_12

    .line 403
    .line 404
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    goto :goto_2

    .line 408
    :cond_14
    iget-object v12, v9, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    .line 409
    .line 410
    if-eqz v11, :cond_15

    .line 411
    .line 412
    iget-object v11, v11, Lp4/b;->a:Ljava/lang/String;

    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_15
    move-object v11, v8

    .line 416
    :goto_4
    if-nez v11, :cond_16

    .line 417
    .line 418
    const-string v11, ""

    .line 419
    .line 420
    :cond_16
    invoke-static {v12, v11}, Lkotlin/collections/j0;->w(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 421
    .line 422
    .line 423
    move-result-object v18

    .line 424
    const/16 v32, 0x0

    .line 425
    .line 426
    const v33, 0x1fffdf4

    .line 427
    .line 428
    .line 429
    const/4 v12, 0x0

    .line 430
    const/4 v14, 0x0

    .line 431
    const/4 v15, 0x0

    .line 432
    const/16 v16, 0x0

    .line 433
    .line 434
    const/16 v17, 0x0

    .line 435
    .line 436
    const/16 v19, 0x0

    .line 437
    .line 438
    const/16 v20, 0x0

    .line 439
    .line 440
    const/16 v21, 0x0

    .line 441
    .line 442
    const/16 v22, 0x0

    .line 443
    .line 444
    const/16 v23, 0x0

    .line 445
    .line 446
    const/16 v24, 0x0

    .line 447
    .line 448
    const/16 v25, 0x0

    .line 449
    .line 450
    const/16 v26, 0x0

    .line 451
    .line 452
    const/16 v27, 0x0

    .line 453
    .line 454
    const/16 v28, 0x0

    .line 455
    .line 456
    const/16 v29, 0x0

    .line 457
    .line 458
    const/16 v30, 0x0

    .line 459
    .line 460
    const/16 v31, 0x0

    .line 461
    .line 462
    move v11, v10

    .line 463
    move v10, v7

    .line 464
    invoke-static/range {v9 .. v33}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 465
    .line 466
    .line 467
    move-result-object v7

    .line 468
    invoke-virtual {v6, v0, v7}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-eqz v0, :cond_c

    .line 473
    .line 474
    goto/16 :goto_18

    .line 475
    .line 476
    :cond_17
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/s0;->a:Lcom/zykj/mistake/feature/notebook/list/s0;

    .line 477
    .line 478
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    if-eqz v2, :cond_19

    .line 483
    .line 484
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 489
    .line 490
    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->g:Z

    .line 491
    .line 492
    if-eqz v2, :cond_63

    .line 493
    .line 494
    iget-boolean v0, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    .line 495
    .line 496
    if-eqz v0, :cond_18

    .line 497
    .line 498
    goto/16 :goto_18

    .line 499
    .line 500
    :cond_18
    invoke-virtual {v1, v4}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->f(Z)V

    .line 501
    .line 502
    .line 503
    return-void

    .line 504
    :cond_19
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/t0;->a:Lcom/zykj/mistake/feature/notebook/list/t0;

    .line 505
    .line 506
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    if-eqz v2, :cond_1b

    .line 511
    .line 512
    :cond_1a
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    move-object v7, v0

    .line 517
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 518
    .line 519
    sget-object v16, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 520
    .line 521
    const/16 v30, 0x0

    .line 522
    .line 523
    const v31, 0x1fffcff

    .line 524
    .line 525
    .line 526
    const/4 v8, 0x0

    .line 527
    const/4 v9, 0x0

    .line 528
    const/4 v10, 0x0

    .line 529
    const/4 v11, 0x0

    .line 530
    const/4 v12, 0x0

    .line 531
    const/4 v13, 0x0

    .line 532
    const/4 v14, 0x0

    .line 533
    const/4 v15, 0x1

    .line 534
    const/16 v17, 0x0

    .line 535
    .line 536
    const/16 v18, 0x0

    .line 537
    .line 538
    const/16 v19, 0x0

    .line 539
    .line 540
    const/16 v20, 0x0

    .line 541
    .line 542
    const/16 v21, 0x0

    .line 543
    .line 544
    const/16 v22, 0x0

    .line 545
    .line 546
    const/16 v23, 0x0

    .line 547
    .line 548
    const/16 v24, 0x0

    .line 549
    .line 550
    const/16 v25, 0x0

    .line 551
    .line 552
    const/16 v26, 0x0

    .line 553
    .line 554
    const/16 v27, 0x0

    .line 555
    .line 556
    const/16 v28, 0x0

    .line 557
    .line 558
    const/16 v29, 0x0

    .line 559
    .line 560
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-eqz v0, :cond_1a

    .line 569
    .line 570
    goto/16 :goto_18

    .line 571
    .line 572
    :cond_1b
    instance-of v2, v0, Lcom/zykj/mistake/feature/notebook/list/u0;

    .line 573
    .line 574
    if-eqz v2, :cond_1d

    .line 575
    .line 576
    :cond_1c
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    move-object v7, v2

    .line 581
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 582
    .line 583
    move-object v3, v0

    .line 584
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/u0;

    .line 585
    .line 586
    iget-object v3, v3, Lcom/zykj/mistake/feature/notebook/list/u0;->a:Ljava/lang/String;

    .line 587
    .line 588
    invoke-static {v3}, Lv7/d;->t(Ljava/lang/Object;)Ljava/util/Set;

    .line 589
    .line 590
    .line 591
    move-result-object v16

    .line 592
    const/16 v30, 0x0

    .line 593
    .line 594
    const v31, 0x1fffcff

    .line 595
    .line 596
    .line 597
    const/4 v8, 0x0

    .line 598
    const/4 v9, 0x0

    .line 599
    const/4 v10, 0x0

    .line 600
    const/4 v11, 0x0

    .line 601
    const/4 v12, 0x0

    .line 602
    const/4 v13, 0x0

    .line 603
    const/4 v14, 0x0

    .line 604
    const/4 v15, 0x1

    .line 605
    const/16 v17, 0x0

    .line 606
    .line 607
    const/16 v18, 0x0

    .line 608
    .line 609
    const/16 v19, 0x0

    .line 610
    .line 611
    const/16 v20, 0x0

    .line 612
    .line 613
    const/16 v21, 0x0

    .line 614
    .line 615
    const/16 v22, 0x0

    .line 616
    .line 617
    const/16 v23, 0x0

    .line 618
    .line 619
    const/16 v24, 0x0

    .line 620
    .line 621
    const/16 v25, 0x0

    .line 622
    .line 623
    const/16 v26, 0x0

    .line 624
    .line 625
    const/16 v27, 0x0

    .line 626
    .line 627
    const/16 v28, 0x0

    .line 628
    .line 629
    const/16 v29, 0x0

    .line 630
    .line 631
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    invoke-virtual {v6, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v2

    .line 639
    if-eqz v2, :cond_1c

    .line 640
    .line 641
    goto/16 :goto_18

    .line 642
    .line 643
    :cond_1d
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/e0;->a:Lcom/zykj/mistake/feature/notebook/list/e0;

    .line 644
    .line 645
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    if-eqz v2, :cond_1f

    .line 650
    .line 651
    :cond_1e
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    move-object v7, v0

    .line 656
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 657
    .line 658
    sget-object v16, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 659
    .line 660
    const/16 v30, 0x0

    .line 661
    .line 662
    const v31, 0x174bcff

    .line 663
    .line 664
    .line 665
    const/4 v8, 0x0

    .line 666
    const/4 v9, 0x0

    .line 667
    const/4 v10, 0x0

    .line 668
    const/4 v11, 0x0

    .line 669
    const/4 v12, 0x0

    .line 670
    const/4 v13, 0x0

    .line 671
    const/4 v14, 0x0

    .line 672
    const/4 v15, 0x0

    .line 673
    const/16 v17, 0x0

    .line 674
    .line 675
    const/16 v18, 0x0

    .line 676
    .line 677
    const/16 v19, 0x0

    .line 678
    .line 679
    const/16 v20, 0x0

    .line 680
    .line 681
    const/16 v21, 0x0

    .line 682
    .line 683
    const/16 v24, 0x0

    .line 684
    .line 685
    const/16 v25, 0x0

    .line 686
    .line 687
    const/16 v26, 0x0

    .line 688
    .line 689
    const/16 v27, 0x0

    .line 690
    .line 691
    const/16 v28, 0x0

    .line 692
    .line 693
    const/16 v29, 0x0

    .line 694
    .line 695
    move-object/from16 v22, v16

    .line 696
    .line 697
    move-object/from16 v23, v16

    .line 698
    .line 699
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    if-eqz v0, :cond_1e

    .line 708
    .line 709
    goto/16 :goto_18

    .line 710
    .line 711
    :cond_1f
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/b0;->a:Lcom/zykj/mistake/feature/notebook/list/b0;

    .line 712
    .line 713
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v2

    .line 717
    if-eqz v2, :cond_21

    .line 718
    .line 719
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 724
    .line 725
    invoke-static {v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->g(Lcom/zykj/mistake/feature/notebook/list/e1;)Ljava/util/ArrayList;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 730
    .line 731
    .line 732
    move-result v0

    .line 733
    if-eqz v0, :cond_20

    .line 734
    .line 735
    goto/16 :goto_18

    .line 736
    .line 737
    :cond_20
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadJoinableCollections$1;

    .line 738
    .line 739
    invoke-direct {v3, v1, v8}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadJoinableCollections$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 740
    .line 741
    .line 742
    new-instance v4, Lcom/zykj/mistake/feature/collection/component/j;

    .line 743
    .line 744
    const/16 v0, 0x1d

    .line 745
    .line 746
    invoke-direct {v4, v0}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 747
    .line 748
    .line 749
    new-instance v5, Lcom/zykj/mistake/feature/notebook/list/j1;

    .line 750
    .line 751
    const/4 v0, 0x1

    .line 752
    invoke-direct {v5, v1, v0}, Lcom/zykj/mistake/feature/notebook/list/j1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;I)V

    .line 753
    .line 754
    .line 755
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 756
    .line 757
    .line 758
    move-result-object v9

    .line 759
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;

    .line 760
    .line 761
    const/4 v6, 0x0

    .line 762
    const/4 v1, 0x1

    .line 763
    move-object/from16 v2, p0

    .line 764
    .line 765
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;-><init>(ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lr6/c;Lr6/c;Lr6/c;Lh6/c;)V

    .line 766
    .line 767
    .line 768
    move-object v1, v2

    .line 769
    invoke-static {v9, v8, v8, v0, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 770
    .line 771
    .line 772
    return-void

    .line 773
    :cond_21
    instance-of v2, v0, Lcom/zykj/mistake/feature/notebook/list/y0;

    .line 774
    .line 775
    if-eqz v2, :cond_28

    .line 776
    .line 777
    :cond_22
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    move-object v9, v2

    .line 782
    check-cast v9, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 783
    .line 784
    iget-object v3, v9, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    .line 785
    .line 786
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    :cond_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 791
    .line 792
    .line 793
    move-result v4

    .line 794
    if-eqz v4, :cond_24

    .line 795
    .line 796
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v4

    .line 800
    move-object v5, v4

    .line 801
    check-cast v5, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 802
    .line 803
    iget-object v5, v5, Lcom/zykj/mistake/feature/notebook/list/a;->a:Ljava/lang/String;

    .line 804
    .line 805
    move-object v7, v0

    .line 806
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/y0;

    .line 807
    .line 808
    iget-object v7, v7, Lcom/zykj/mistake/feature/notebook/list/y0;->a:Ljava/lang/String;

    .line 809
    .line 810
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    move-result v5

    .line 814
    if-eqz v5, :cond_23

    .line 815
    .line 816
    goto :goto_5

    .line 817
    :cond_24
    move-object v4, v8

    .line 818
    :goto_5
    check-cast v4, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 819
    .line 820
    if-eqz v4, :cond_27

    .line 821
    .line 822
    iget-boolean v3, v4, Lcom/zykj/mistake/feature/notebook/list/a;->e:Z

    .line 823
    .line 824
    if-eqz v3, :cond_25

    .line 825
    .line 826
    goto :goto_6

    .line 827
    :cond_25
    iget-object v3, v9, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    .line 828
    .line 829
    check-cast v3, Ljava/lang/Iterable;

    .line 830
    .line 831
    invoke-static {v3}, Lkotlin/collections/t;->G0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 832
    .line 833
    .line 834
    move-result-object v3

    .line 835
    move-object v4, v0

    .line 836
    check-cast v4, Lcom/zykj/mistake/feature/notebook/list/y0;

    .line 837
    .line 838
    iget-object v4, v4, Lcom/zykj/mistake/feature/notebook/list/y0;->a:Ljava/lang/String;

    .line 839
    .line 840
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    move-result v5

    .line 844
    if-nez v5, :cond_26

    .line 845
    .line 846
    invoke-interface {v3, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    :cond_26
    const/16 v32, 0x0

    .line 850
    .line 851
    const v33, 0x1fdffff

    .line 852
    .line 853
    .line 854
    const/4 v10, 0x0

    .line 855
    const/4 v11, 0x0

    .line 856
    const/4 v12, 0x0

    .line 857
    const/4 v13, 0x0

    .line 858
    const/4 v14, 0x0

    .line 859
    const/4 v15, 0x0

    .line 860
    const/16 v16, 0x0

    .line 861
    .line 862
    const/16 v17, 0x0

    .line 863
    .line 864
    const/16 v18, 0x0

    .line 865
    .line 866
    const/16 v19, 0x0

    .line 867
    .line 868
    const/16 v20, 0x0

    .line 869
    .line 870
    const/16 v21, 0x0

    .line 871
    .line 872
    const/16 v22, 0x0

    .line 873
    .line 874
    const/16 v23, 0x0

    .line 875
    .line 876
    const/16 v24, 0x0

    .line 877
    .line 878
    const/16 v26, 0x0

    .line 879
    .line 880
    const/16 v27, 0x0

    .line 881
    .line 882
    const/16 v28, 0x0

    .line 883
    .line 884
    const/16 v29, 0x0

    .line 885
    .line 886
    const/16 v30, 0x0

    .line 887
    .line 888
    const/16 v31, 0x0

    .line 889
    .line 890
    move-object/from16 v25, v3

    .line 891
    .line 892
    invoke-static/range {v9 .. v33}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 893
    .line 894
    .line 895
    move-result-object v9

    .line 896
    :cond_27
    :goto_6
    invoke-virtual {v6, v2, v9}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v2

    .line 900
    if-eqz v2, :cond_22

    .line 901
    .line 902
    goto/16 :goto_18

    .line 903
    .line 904
    :cond_28
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/k0;->a:Lcom/zykj/mistake/feature/notebook/list/k0;

    .line 905
    .line 906
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    move-result v2

    .line 910
    const/16 v3, 0xa

    .line 911
    .line 912
    if-eqz v2, :cond_38

    .line 913
    .line 914
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 919
    .line 920
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    .line 921
    .line 922
    check-cast v2, Ljava/lang/Iterable;

    .line 923
    .line 924
    invoke-static {v2}, Lkotlin/collections/t;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 925
    .line 926
    .line 927
    move-result-object v2

    .line 928
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 929
    .line 930
    .line 931
    move-result v5

    .line 932
    if-eqz v5, :cond_29

    .line 933
    .line 934
    goto/16 :goto_18

    .line 935
    .line 936
    :cond_29
    invoke-static {v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->g(Lcom/zykj/mistake/feature/notebook/list/e1;)Ljava/util/ArrayList;

    .line 937
    .line 938
    .line 939
    move-result-object v5

    .line 940
    new-instance v9, Ljava/util/ArrayList;

    .line 941
    .line 942
    invoke-static {v5, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 943
    .line 944
    .line 945
    move-result v10

    .line 946
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 950
    .line 951
    .line 952
    move-result v10

    .line 953
    move v11, v4

    .line 954
    :goto_7
    if-ge v11, v10, :cond_2a

    .line 955
    .line 956
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v12

    .line 960
    add-int/lit8 v11, v11, 0x1

    .line 961
    .line 962
    check-cast v12, Lp4/b;

    .line 963
    .line 964
    iget v12, v12, Lp4/b;->c:I

    .line 965
    .line 966
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 967
    .line 968
    .line 969
    move-result-object v12

    .line 970
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    goto :goto_7

    .line 974
    :cond_2a
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 975
    .line 976
    .line 977
    move-result v10

    .line 978
    if-eqz v10, :cond_2b

    .line 979
    .line 980
    goto/16 :goto_18

    .line 981
    .line 982
    :cond_2b
    iget-object v10, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    .line 983
    .line 984
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    .line 985
    .line 986
    const-string v11, "collections"

    .line 987
    .line 988
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 989
    .line 990
    .line 991
    const-string v11, "selectedCollectionIds"

    .line 992
    .line 993
    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 997
    .line 998
    .line 999
    move-result v11

    .line 1000
    if-nez v11, :cond_37

    .line 1001
    .line 1002
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v11

    .line 1006
    if-eqz v11, :cond_2c

    .line 1007
    .line 1008
    goto/16 :goto_c

    .line 1009
    .line 1010
    :cond_2c
    invoke-static {v10, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 1011
    .line 1012
    .line 1013
    move-result v3

    .line 1014
    invoke-static {v3}, Lkotlin/collections/e0;->C(I)I

    .line 1015
    .line 1016
    .line 1017
    move-result v3

    .line 1018
    const/16 v11, 0x10

    .line 1019
    .line 1020
    if-ge v3, v11, :cond_2d

    .line 1021
    .line 1022
    move v3, v11

    .line 1023
    :cond_2d
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 1024
    .line 1025
    invoke-direct {v11, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1026
    .line 1027
    .line 1028
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v3

    .line 1032
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1033
    .line 1034
    .line 1035
    move-result v10

    .line 1036
    if-eqz v10, :cond_2e

    .line 1037
    .line 1038
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v10

    .line 1042
    move-object v12, v10

    .line 1043
    check-cast v12, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 1044
    .line 1045
    iget-object v12, v12, Lcom/zykj/mistake/feature/notebook/list/a;->a:Ljava/lang/String;

    .line 1046
    .line 1047
    invoke-interface {v11, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    goto :goto_8

    .line 1051
    :cond_2e
    check-cast v0, Ljava/lang/Iterable;

    .line 1052
    .line 1053
    instance-of v3, v0, Ljava/util/Collection;

    .line 1054
    .line 1055
    if-eqz v3, :cond_2f

    .line 1056
    .line 1057
    move-object v3, v0

    .line 1058
    check-cast v3, Ljava/util/Collection;

    .line 1059
    .line 1060
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1061
    .line 1062
    .line 1063
    move-result v3

    .line 1064
    if-eqz v3, :cond_2f

    .line 1065
    .line 1066
    goto/16 :goto_c

    .line 1067
    .line 1068
    :cond_2f
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    :cond_30
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1073
    .line 1074
    .line 1075
    move-result v3

    .line 1076
    if-eqz v3, :cond_37

    .line 1077
    .line 1078
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v3

    .line 1082
    check-cast v3, Ljava/lang/String;

    .line 1083
    .line 1084
    invoke-virtual {v11, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v10

    .line 1088
    check-cast v10, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 1089
    .line 1090
    if-nez v10, :cond_31

    .line 1091
    .line 1092
    goto :goto_9

    .line 1093
    :cond_31
    invoke-static {v3}, Lkotlin/text/w;->D(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v3

    .line 1097
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1098
    .line 1099
    .line 1100
    move-result v12

    .line 1101
    if-eqz v12, :cond_32

    .line 1102
    .line 1103
    move v13, v4

    .line 1104
    goto :goto_b

    .line 1105
    :cond_32
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1106
    .line 1107
    .line 1108
    move-result v12

    .line 1109
    move v13, v4

    .line 1110
    move v14, v13

    .line 1111
    :cond_33
    :goto_a
    if-ge v14, v12, :cond_35

    .line 1112
    .line 1113
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v15

    .line 1117
    add-int/lit8 v14, v14, 0x1

    .line 1118
    .line 1119
    check-cast v15, Lp4/b;

    .line 1120
    .line 1121
    iget-object v15, v15, Lp4/b;->o:Ljava/util/Set;

    .line 1122
    .line 1123
    check-cast v15, Ljava/lang/Iterable;

    .line 1124
    .line 1125
    invoke-static {v15, v3}, Lkotlin/collections/t;->d0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v15

    .line 1129
    if-nez v15, :cond_33

    .line 1130
    .line 1131
    add-int/lit8 v13, v13, 0x1

    .line 1132
    .line 1133
    if-ltz v13, :cond_34

    .line 1134
    .line 1135
    goto :goto_a

    .line 1136
    :cond_34
    invoke-static {}, Lkotlin/collections/u;->K()V

    .line 1137
    .line 1138
    .line 1139
    throw v8

    .line 1140
    :cond_35
    :goto_b
    iget v3, v10, Lcom/zykj/mistake/feature/notebook/list/a;->c:I

    .line 1141
    .line 1142
    add-int/2addr v3, v13

    .line 1143
    iget v10, v10, Lcom/zykj/mistake/feature/notebook/list/a;->d:I

    .line 1144
    .line 1145
    if-le v3, v10, :cond_30

    .line 1146
    .line 1147
    :cond_36
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    move-object v7, v0

    .line 1152
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1153
    .line 1154
    const/16 v30, 0x1

    .line 1155
    .line 1156
    const v31, 0xffffff

    .line 1157
    .line 1158
    .line 1159
    const/4 v8, 0x0

    .line 1160
    const/4 v9, 0x0

    .line 1161
    const/4 v10, 0x0

    .line 1162
    const/4 v11, 0x0

    .line 1163
    const/4 v12, 0x0

    .line 1164
    const/4 v13, 0x0

    .line 1165
    const/4 v14, 0x0

    .line 1166
    const/4 v15, 0x0

    .line 1167
    const/16 v16, 0x0

    .line 1168
    .line 1169
    const/16 v17, 0x0

    .line 1170
    .line 1171
    const/16 v18, 0x0

    .line 1172
    .line 1173
    const/16 v19, 0x0

    .line 1174
    .line 1175
    const/16 v20, 0x0

    .line 1176
    .line 1177
    const/16 v21, 0x0

    .line 1178
    .line 1179
    const/16 v22, 0x0

    .line 1180
    .line 1181
    const/16 v23, 0x0

    .line 1182
    .line 1183
    const/16 v24, 0x0

    .line 1184
    .line 1185
    const/16 v25, 0x0

    .line 1186
    .line 1187
    const/16 v26, 0x0

    .line 1188
    .line 1189
    const/16 v27, 0x0

    .line 1190
    .line 1191
    const/16 v28, 0x0

    .line 1192
    .line 1193
    const/16 v29, 0x0

    .line 1194
    .line 1195
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v2

    .line 1199
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v0

    .line 1203
    if-eqz v0, :cond_36

    .line 1204
    .line 1205
    goto/16 :goto_18

    .line 1206
    .line 1207
    :cond_37
    :goto_c
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v0

    .line 1211
    move-object v10, v0

    .line 1212
    check-cast v10, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1213
    .line 1214
    const/16 v33, 0x0

    .line 1215
    .line 1216
    const v34, 0x1fbffff

    .line 1217
    .line 1218
    .line 1219
    const/4 v11, 0x0

    .line 1220
    const/4 v12, 0x0

    .line 1221
    const/4 v13, 0x0

    .line 1222
    const/4 v14, 0x0

    .line 1223
    const/4 v15, 0x0

    .line 1224
    const/16 v16, 0x0

    .line 1225
    .line 1226
    const/16 v17, 0x0

    .line 1227
    .line 1228
    const/16 v18, 0x0

    .line 1229
    .line 1230
    const/16 v19, 0x0

    .line 1231
    .line 1232
    const/16 v20, 0x0

    .line 1233
    .line 1234
    const/16 v21, 0x0

    .line 1235
    .line 1236
    const/16 v22, 0x0

    .line 1237
    .line 1238
    const/16 v23, 0x0

    .line 1239
    .line 1240
    const/16 v24, 0x0

    .line 1241
    .line 1242
    const/16 v25, 0x0

    .line 1243
    .line 1244
    const/16 v26, 0x0

    .line 1245
    .line 1246
    const/16 v27, 0x1

    .line 1247
    .line 1248
    const/16 v28, 0x0

    .line 1249
    .line 1250
    const/16 v29, 0x0

    .line 1251
    .line 1252
    const/16 v30, 0x0

    .line 1253
    .line 1254
    const/16 v31, 0x0

    .line 1255
    .line 1256
    const/16 v32, 0x0

    .line 1257
    .line 1258
    invoke-static/range {v10 .. v34}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v3

    .line 1262
    invoke-virtual {v6, v0, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1263
    .line 1264
    .line 1265
    move-result v0

    .line 1266
    if-eqz v0, :cond_37

    .line 1267
    .line 1268
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;

    .line 1273
    .line 1274
    invoke-direct {v3, v1, v2, v9, v8}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/util/List;Ljava/util/List;Lh6/c;)V

    .line 1275
    .line 1276
    .line 1277
    invoke-static {v0, v8, v8, v3, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 1278
    .line 1279
    .line 1280
    return-void

    .line 1281
    :cond_38
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/p0;->a:Lcom/zykj/mistake/feature/notebook/list/p0;

    .line 1282
    .line 1283
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1284
    .line 1285
    .line 1286
    move-result v2

    .line 1287
    if-eqz v2, :cond_3a

    .line 1288
    .line 1289
    :cond_39
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v0

    .line 1293
    move-object v7, v0

    .line 1294
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1295
    .line 1296
    sget-object v22, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 1297
    .line 1298
    const/16 v30, 0x0

    .line 1299
    .line 1300
    const v31, 0x1f8bfff

    .line 1301
    .line 1302
    .line 1303
    const/4 v8, 0x0

    .line 1304
    const/4 v9, 0x0

    .line 1305
    const/4 v10, 0x0

    .line 1306
    const/4 v11, 0x0

    .line 1307
    const/4 v12, 0x0

    .line 1308
    const/4 v13, 0x0

    .line 1309
    const/4 v14, 0x0

    .line 1310
    const/4 v15, 0x0

    .line 1311
    const/16 v16, 0x0

    .line 1312
    .line 1313
    const/16 v17, 0x0

    .line 1314
    .line 1315
    const/16 v18, 0x0

    .line 1316
    .line 1317
    const/16 v19, 0x0

    .line 1318
    .line 1319
    const/16 v20, 0x0

    .line 1320
    .line 1321
    const/16 v21, 0x0

    .line 1322
    .line 1323
    const/16 v24, 0x0

    .line 1324
    .line 1325
    const/16 v25, 0x0

    .line 1326
    .line 1327
    const/16 v26, 0x0

    .line 1328
    .line 1329
    const/16 v27, 0x0

    .line 1330
    .line 1331
    const/16 v28, 0x0

    .line 1332
    .line 1333
    const/16 v29, 0x0

    .line 1334
    .line 1335
    move-object/from16 v23, v22

    .line 1336
    .line 1337
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v2

    .line 1341
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v0

    .line 1345
    if-eqz v0, :cond_39

    .line 1346
    .line 1347
    goto/16 :goto_18

    .line 1348
    .line 1349
    :cond_3a
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/n0;->a:Lcom/zykj/mistake/feature/notebook/list/n0;

    .line 1350
    .line 1351
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v2

    .line 1355
    if-eqz v2, :cond_3c

    .line 1356
    .line 1357
    :cond_3b
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    move-object v7, v0

    .line 1362
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1363
    .line 1364
    const/16 v30, 0x0

    .line 1365
    .line 1366
    const v31, 0xffffff

    .line 1367
    .line 1368
    .line 1369
    const/4 v8, 0x0

    .line 1370
    const/4 v9, 0x0

    .line 1371
    const/4 v10, 0x0

    .line 1372
    const/4 v11, 0x0

    .line 1373
    const/4 v12, 0x0

    .line 1374
    const/4 v13, 0x0

    .line 1375
    const/4 v14, 0x0

    .line 1376
    const/4 v15, 0x0

    .line 1377
    const/16 v16, 0x0

    .line 1378
    .line 1379
    const/16 v17, 0x0

    .line 1380
    .line 1381
    const/16 v18, 0x0

    .line 1382
    .line 1383
    const/16 v19, 0x0

    .line 1384
    .line 1385
    const/16 v20, 0x0

    .line 1386
    .line 1387
    const/16 v21, 0x0

    .line 1388
    .line 1389
    const/16 v22, 0x0

    .line 1390
    .line 1391
    const/16 v23, 0x0

    .line 1392
    .line 1393
    const/16 v24, 0x0

    .line 1394
    .line 1395
    const/16 v25, 0x0

    .line 1396
    .line 1397
    const/16 v26, 0x0

    .line 1398
    .line 1399
    const/16 v27, 0x0

    .line 1400
    .line 1401
    const/16 v28, 0x0

    .line 1402
    .line 1403
    const/16 v29, 0x0

    .line 1404
    .line 1405
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v2

    .line 1409
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v0

    .line 1413
    if-eqz v0, :cond_3b

    .line 1414
    .line 1415
    goto/16 :goto_18

    .line 1416
    .line 1417
    :cond_3c
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/z0;->a:Lcom/zykj/mistake/feature/notebook/list/z0;

    .line 1418
    .line 1419
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1420
    .line 1421
    .line 1422
    move-result v2

    .line 1423
    if-eqz v2, :cond_3e

    .line 1424
    .line 1425
    :cond_3d
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    move-object v7, v0

    .line 1430
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1431
    .line 1432
    sget-object v29, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;->FROM_SELECT:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    .line 1433
    .line 1434
    const/16 v30, 0x0

    .line 1435
    .line 1436
    const v31, 0x147bfff

    .line 1437
    .line 1438
    .line 1439
    const/4 v8, 0x0

    .line 1440
    const/4 v9, 0x0

    .line 1441
    const/4 v10, 0x0

    .line 1442
    const/4 v11, 0x0

    .line 1443
    const/4 v12, 0x0

    .line 1444
    const/4 v13, 0x0

    .line 1445
    const/4 v14, 0x0

    .line 1446
    const/4 v15, 0x0

    .line 1447
    const/16 v16, 0x0

    .line 1448
    .line 1449
    const/16 v17, 0x0

    .line 1450
    .line 1451
    const/16 v18, 0x0

    .line 1452
    .line 1453
    const/16 v19, 0x0

    .line 1454
    .line 1455
    const/16 v20, 0x0

    .line 1456
    .line 1457
    const/16 v21, 0x0

    .line 1458
    .line 1459
    const/16 v22, 0x0

    .line 1460
    .line 1461
    const/16 v23, 0x0

    .line 1462
    .line 1463
    const/16 v24, 0x0

    .line 1464
    .line 1465
    const/16 v25, 0x1

    .line 1466
    .line 1467
    const-string v26, ""

    .line 1468
    .line 1469
    const-string v27, ""

    .line 1470
    .line 1471
    const/16 v28, 0x0

    .line 1472
    .line 1473
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v2

    .line 1477
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1478
    .line 1479
    .line 1480
    move-result v0

    .line 1481
    if-eqz v0, :cond_3d

    .line 1482
    .line 1483
    goto/16 :goto_18

    .line 1484
    .line 1485
    :cond_3e
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/o0;->a:Lcom/zykj/mistake/feature/notebook/list/o0;

    .line 1486
    .line 1487
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1488
    .line 1489
    .line 1490
    move-result v2

    .line 1491
    if-eqz v2, :cond_40

    .line 1492
    .line 1493
    :cond_3f
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    move-object v7, v0

    .line 1498
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1499
    .line 1500
    const/16 v30, 0x0

    .line 1501
    .line 1502
    const v31, 0x107ffff

    .line 1503
    .line 1504
    .line 1505
    const/4 v8, 0x0

    .line 1506
    const/4 v9, 0x0

    .line 1507
    const/4 v10, 0x0

    .line 1508
    const/4 v11, 0x0

    .line 1509
    const/4 v12, 0x0

    .line 1510
    const/4 v13, 0x0

    .line 1511
    const/4 v14, 0x0

    .line 1512
    const/4 v15, 0x0

    .line 1513
    const/16 v16, 0x0

    .line 1514
    .line 1515
    const/16 v17, 0x0

    .line 1516
    .line 1517
    const/16 v18, 0x0

    .line 1518
    .line 1519
    const/16 v19, 0x0

    .line 1520
    .line 1521
    const/16 v20, 0x0

    .line 1522
    .line 1523
    const/16 v21, 0x0

    .line 1524
    .line 1525
    const/16 v22, 0x0

    .line 1526
    .line 1527
    const/16 v23, 0x0

    .line 1528
    .line 1529
    const/16 v24, 0x0

    .line 1530
    .line 1531
    const/16 v25, 0x0

    .line 1532
    .line 1533
    const-string v26, ""

    .line 1534
    .line 1535
    const-string v27, ""

    .line 1536
    .line 1537
    const/16 v28, 0x0

    .line 1538
    .line 1539
    const/16 v29, 0x0

    .line 1540
    .line 1541
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v2

    .line 1545
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1546
    .line 1547
    .line 1548
    move-result v0

    .line 1549
    if-eqz v0, :cond_3f

    .line 1550
    .line 1551
    goto/16 :goto_18

    .line 1552
    .line 1553
    :cond_40
    instance-of v2, v0, Lcom/zykj/mistake/feature/notebook/list/f0;

    .line 1554
    .line 1555
    if-eqz v2, :cond_42

    .line 1556
    .line 1557
    :cond_41
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v2

    .line 1561
    move-object v7, v2

    .line 1562
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1563
    .line 1564
    move-object v3, v0

    .line 1565
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/f0;

    .line 1566
    .line 1567
    iget-object v3, v3, Lcom/zykj/mistake/feature/notebook/list/f0;->a:Ljava/lang/String;

    .line 1568
    .line 1569
    const/16 v4, 0x14

    .line 1570
    .line 1571
    invoke-static {v4, v3}, Lkotlin/text/p;->i0(ILjava/lang/String;)Ljava/lang/String;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v26

    .line 1575
    const/16 v30, 0x0

    .line 1576
    .line 1577
    const v31, 0x1cfffff

    .line 1578
    .line 1579
    .line 1580
    const/4 v8, 0x0

    .line 1581
    const/4 v9, 0x0

    .line 1582
    const/4 v10, 0x0

    .line 1583
    const/4 v11, 0x0

    .line 1584
    const/4 v12, 0x0

    .line 1585
    const/4 v13, 0x0

    .line 1586
    const/4 v14, 0x0

    .line 1587
    const/4 v15, 0x0

    .line 1588
    const/16 v16, 0x0

    .line 1589
    .line 1590
    const/16 v17, 0x0

    .line 1591
    .line 1592
    const/16 v18, 0x0

    .line 1593
    .line 1594
    const/16 v19, 0x0

    .line 1595
    .line 1596
    const/16 v20, 0x0

    .line 1597
    .line 1598
    const/16 v21, 0x0

    .line 1599
    .line 1600
    const/16 v22, 0x0

    .line 1601
    .line 1602
    const/16 v23, 0x0

    .line 1603
    .line 1604
    const/16 v24, 0x0

    .line 1605
    .line 1606
    const/16 v25, 0x0

    .line 1607
    .line 1608
    const-string v27, ""

    .line 1609
    .line 1610
    const/16 v28, 0x0

    .line 1611
    .line 1612
    const/16 v29, 0x0

    .line 1613
    .line 1614
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v3

    .line 1618
    invoke-virtual {v6, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1619
    .line 1620
    .line 1621
    move-result v2

    .line 1622
    if-eqz v2, :cond_41

    .line 1623
    .line 1624
    goto/16 :goto_18

    .line 1625
    .line 1626
    :cond_42
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/h0;->a:Lcom/zykj/mistake/feature/notebook/list/h0;

    .line 1627
    .line 1628
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1629
    .line 1630
    .line 1631
    move-result v2

    .line 1632
    if-eqz v2, :cond_47

    .line 1633
    .line 1634
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v0

    .line 1638
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1639
    .line 1640
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->u:Ljava/lang/String;

    .line 1641
    .line 1642
    invoke-static {v2}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v2

    .line 1646
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v2

    .line 1650
    invoke-static {v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->g(Lcom/zykj/mistake/feature/notebook/list/e1;)Ljava/util/ArrayList;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v5

    .line 1654
    move v9, v4

    .line 1655
    new-instance v4, Ljava/util/ArrayList;

    .line 1656
    .line 1657
    invoke-static {v5, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 1658
    .line 1659
    .line 1660
    move-result v3

    .line 1661
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1662
    .line 1663
    .line 1664
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1665
    .line 1666
    .line 1667
    move-result v3

    .line 1668
    :goto_d
    if-ge v9, v3, :cond_43

    .line 1669
    .line 1670
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v10

    .line 1674
    add-int/lit8 v9, v9, 0x1

    .line 1675
    .line 1676
    check-cast v10, Lp4/b;

    .line 1677
    .line 1678
    iget v10, v10, Lp4/b;->c:I

    .line 1679
    .line 1680
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v10

    .line 1684
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1685
    .line 1686
    .line 1687
    goto :goto_d

    .line 1688
    :cond_43
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->x:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    .line 1689
    .line 1690
    invoke-static {v2}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 1691
    .line 1692
    .line 1693
    move-result v0

    .line 1694
    if-eqz v0, :cond_45

    .line 1695
    .line 1696
    :cond_44
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v0

    .line 1700
    move-object v7, v0

    .line 1701
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1702
    .line 1703
    const/16 v30, 0x0

    .line 1704
    .line 1705
    const v31, 0x1dfffff

    .line 1706
    .line 1707
    .line 1708
    const/4 v8, 0x0

    .line 1709
    const/4 v9, 0x0

    .line 1710
    const/4 v10, 0x0

    .line 1711
    const/4 v11, 0x0

    .line 1712
    const/4 v12, 0x0

    .line 1713
    const/4 v13, 0x0

    .line 1714
    const/4 v14, 0x0

    .line 1715
    const/4 v15, 0x0

    .line 1716
    const/16 v16, 0x0

    .line 1717
    .line 1718
    const/16 v17, 0x0

    .line 1719
    .line 1720
    const/16 v18, 0x0

    .line 1721
    .line 1722
    const/16 v19, 0x0

    .line 1723
    .line 1724
    const/16 v20, 0x0

    .line 1725
    .line 1726
    const/16 v21, 0x0

    .line 1727
    .line 1728
    const/16 v22, 0x0

    .line 1729
    .line 1730
    const/16 v23, 0x0

    .line 1731
    .line 1732
    const/16 v24, 0x0

    .line 1733
    .line 1734
    const/16 v25, 0x0

    .line 1735
    .line 1736
    const/16 v26, 0x0

    .line 1737
    .line 1738
    const-string v27, "\u8bf7\u8f93\u5165\u9519\u9898\u96c6\u540d\u79f0"

    .line 1739
    .line 1740
    const/16 v28, 0x0

    .line 1741
    .line 1742
    const/16 v29, 0x0

    .line 1743
    .line 1744
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v2

    .line 1748
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1749
    .line 1750
    .line 1751
    move-result v0

    .line 1752
    if-eqz v0, :cond_44

    .line 1753
    .line 1754
    goto/16 :goto_18

    .line 1755
    .line 1756
    :cond_45
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1757
    .line 1758
    .line 1759
    move-result v0

    .line 1760
    if-eqz v0, :cond_46

    .line 1761
    .line 1762
    goto/16 :goto_18

    .line 1763
    .line 1764
    :cond_46
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v0

    .line 1768
    move-object v9, v0

    .line 1769
    check-cast v9, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1770
    .line 1771
    const/16 v32, 0x0

    .line 1772
    .line 1773
    const v33, 0x19fffff

    .line 1774
    .line 1775
    .line 1776
    const/4 v10, 0x0

    .line 1777
    const/4 v11, 0x0

    .line 1778
    const/4 v12, 0x0

    .line 1779
    const/4 v13, 0x0

    .line 1780
    const/4 v14, 0x0

    .line 1781
    const/4 v15, 0x0

    .line 1782
    const/16 v16, 0x0

    .line 1783
    .line 1784
    const/16 v17, 0x0

    .line 1785
    .line 1786
    const/16 v18, 0x0

    .line 1787
    .line 1788
    const/16 v19, 0x0

    .line 1789
    .line 1790
    const/16 v20, 0x0

    .line 1791
    .line 1792
    const/16 v21, 0x0

    .line 1793
    .line 1794
    const/16 v22, 0x0

    .line 1795
    .line 1796
    const/16 v23, 0x0

    .line 1797
    .line 1798
    const/16 v24, 0x0

    .line 1799
    .line 1800
    const/16 v25, 0x0

    .line 1801
    .line 1802
    const/16 v26, 0x0

    .line 1803
    .line 1804
    const/16 v27, 0x0

    .line 1805
    .line 1806
    const/16 v28, 0x0

    .line 1807
    .line 1808
    const-string v29, ""

    .line 1809
    .line 1810
    const/16 v30, 0x1

    .line 1811
    .line 1812
    const/16 v31, 0x0

    .line 1813
    .line 1814
    invoke-static/range {v9 .. v33}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v5

    .line 1818
    invoke-virtual {v6, v0, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1819
    .line 1820
    .line 1821
    move-result v0

    .line 1822
    if-eqz v0, :cond_46

    .line 1823
    .line 1824
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v6

    .line 1828
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;

    .line 1829
    .line 1830
    const/4 v5, 0x0

    .line 1831
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;Ljava/util/List;Lh6/c;)V

    .line 1832
    .line 1833
    .line 1834
    invoke-static {v6, v8, v8, v0, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 1835
    .line 1836
    .line 1837
    return-void

    .line 1838
    :cond_47
    move v9, v4

    .line 1839
    instance-of v2, v0, Lcom/zykj/mistake/feature/notebook/list/c1;

    .line 1840
    .line 1841
    if-eqz v2, :cond_4a

    .line 1842
    .line 1843
    :cond_48
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v2

    .line 1847
    move-object v7, v2

    .line 1848
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1849
    .line 1850
    iget-object v3, v7, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    .line 1851
    .line 1852
    check-cast v3, Ljava/lang/Iterable;

    .line 1853
    .line 1854
    invoke-static {v3}, Lkotlin/collections/t;->G0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v3

    .line 1858
    move-object v4, v0

    .line 1859
    check-cast v4, Lcom/zykj/mistake/feature/notebook/list/c1;

    .line 1860
    .line 1861
    iget-object v4, v4, Lcom/zykj/mistake/feature/notebook/list/c1;->a:Ljava/lang/String;

    .line 1862
    .line 1863
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1864
    .line 1865
    .line 1866
    move-result v5

    .line 1867
    if-nez v5, :cond_49

    .line 1868
    .line 1869
    invoke-interface {v3, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1870
    .line 1871
    .line 1872
    :cond_49
    const/16 v30, 0x0

    .line 1873
    .line 1874
    const v31, 0x1fffdff

    .line 1875
    .line 1876
    .line 1877
    const/4 v8, 0x0

    .line 1878
    const/4 v9, 0x0

    .line 1879
    const/4 v10, 0x0

    .line 1880
    const/4 v11, 0x0

    .line 1881
    const/4 v12, 0x0

    .line 1882
    const/4 v13, 0x0

    .line 1883
    const/4 v14, 0x0

    .line 1884
    const/4 v15, 0x0

    .line 1885
    const/16 v17, 0x0

    .line 1886
    .line 1887
    const/16 v18, 0x0

    .line 1888
    .line 1889
    const/16 v19, 0x0

    .line 1890
    .line 1891
    const/16 v20, 0x0

    .line 1892
    .line 1893
    const/16 v21, 0x0

    .line 1894
    .line 1895
    const/16 v22, 0x0

    .line 1896
    .line 1897
    const/16 v23, 0x0

    .line 1898
    .line 1899
    const/16 v24, 0x0

    .line 1900
    .line 1901
    const/16 v25, 0x0

    .line 1902
    .line 1903
    const/16 v26, 0x0

    .line 1904
    .line 1905
    const/16 v27, 0x0

    .line 1906
    .line 1907
    const/16 v28, 0x0

    .line 1908
    .line 1909
    const/16 v29, 0x0

    .line 1910
    .line 1911
    move-object/from16 v16, v3

    .line 1912
    .line 1913
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v3

    .line 1917
    invoke-virtual {v6, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1918
    .line 1919
    .line 1920
    move-result v2

    .line 1921
    if-eqz v2, :cond_48

    .line 1922
    .line 1923
    goto/16 :goto_18

    .line 1924
    .line 1925
    :cond_4a
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/d0;->a:Lcom/zykj/mistake/feature/notebook/list/d0;

    .line 1926
    .line 1927
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1928
    .line 1929
    .line 1930
    move-result v2

    .line 1931
    if-eqz v2, :cond_4b

    .line 1932
    .line 1933
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadCustomTags$1;

    .line 1934
    .line 1935
    invoke-direct {v3, v1, v8}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadCustomTags$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 1936
    .line 1937
    .line 1938
    new-instance v5, Lcom/zykj/mistake/feature/notebook/list/j1;

    .line 1939
    .line 1940
    const/4 v0, 0x0

    .line 1941
    invoke-direct {v5, v1, v0}, Lcom/zykj/mistake/feature/notebook/list/j1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;I)V

    .line 1942
    .line 1943
    .line 1944
    new-instance v4, Lcom/zykj/mistake/feature/collection/component/j;

    .line 1945
    .line 1946
    const/16 v0, 0x1c

    .line 1947
    .line 1948
    invoke-direct {v4, v0}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 1949
    .line 1950
    .line 1951
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v9

    .line 1955
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;

    .line 1956
    .line 1957
    const/4 v6, 0x0

    .line 1958
    const/4 v1, 0x1

    .line 1959
    move-object/from16 v2, p0

    .line 1960
    .line 1961
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;-><init>(ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lr6/c;Lr6/c;Lr6/c;Lh6/c;)V

    .line 1962
    .line 1963
    .line 1964
    move-object v1, v2

    .line 1965
    invoke-static {v9, v8, v8, v0, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 1966
    .line 1967
    .line 1968
    return-void

    .line 1969
    :cond_4b
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/c0;->a:Lcom/zykj/mistake/feature/notebook/list/c0;

    .line 1970
    .line 1971
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1972
    .line 1973
    .line 1974
    move-result v2

    .line 1975
    if-eqz v2, :cond_4c

    .line 1976
    .line 1977
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v0

    .line 1981
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$dispatch$15;

    .line 1982
    .line 1983
    invoke-direct {v2, v1, v8}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$dispatch$15;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 1984
    .line 1985
    .line 1986
    invoke-static {v0, v8, v8, v2, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 1987
    .line 1988
    .line 1989
    return-void

    .line 1990
    :cond_4c
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/i0;->a:Lcom/zykj/mistake/feature/notebook/list/i0;

    .line 1991
    .line 1992
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1993
    .line 1994
    .line 1995
    move-result v2

    .line 1996
    if-eqz v2, :cond_56

    .line 1997
    .line 1998
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v0

    .line 2002
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 2003
    .line 2004
    invoke-static {v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->g(Lcom/zykj/mistake/feature/notebook/list/e1;)Ljava/util/ArrayList;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v5

    .line 2008
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2009
    .line 2010
    .line 2011
    move-result v2

    .line 2012
    if-eqz v2, :cond_4d

    .line 2013
    .line 2014
    goto/16 :goto_18

    .line 2015
    .line 2016
    :cond_4d
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2017
    .line 2018
    .line 2019
    move-result v2

    .line 2020
    if-eqz v2, :cond_4e

    .line 2021
    .line 2022
    move v4, v9

    .line 2023
    goto :goto_f

    .line 2024
    :cond_4e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 2025
    .line 2026
    .line 2027
    move-result v2

    .line 2028
    move v4, v9

    .line 2029
    move v6, v4

    .line 2030
    :cond_4f
    :goto_e
    if-ge v6, v2, :cond_51

    .line 2031
    .line 2032
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v10

    .line 2036
    add-int/lit8 v6, v6, 0x1

    .line 2037
    .line 2038
    check-cast v10, Lp4/b;

    .line 2039
    .line 2040
    iget-boolean v10, v10, Lp4/b;->m:Z

    .line 2041
    .line 2042
    if-eqz v10, :cond_4f

    .line 2043
    .line 2044
    add-int/lit8 v4, v4, 0x1

    .line 2045
    .line 2046
    if-ltz v4, :cond_50

    .line 2047
    .line 2048
    goto :goto_e

    .line 2049
    :cond_50
    invoke-static {}, Lkotlin/collections/u;->K()V

    .line 2050
    .line 2051
    .line 2052
    throw v8

    .line 2053
    :cond_51
    :goto_f
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 2054
    .line 2055
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2056
    .line 2057
    .line 2058
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 2059
    .line 2060
    .line 2061
    move-result v6

    .line 2062
    :goto_10
    if-ge v9, v6, :cond_53

    .line 2063
    .line 2064
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v10

    .line 2068
    add-int/lit8 v9, v9, 0x1

    .line 2069
    .line 2070
    move-object v11, v10

    .line 2071
    check-cast v11, Lp4/b;

    .line 2072
    .line 2073
    iget v11, v11, Lp4/b;->b:I

    .line 2074
    .line 2075
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v11

    .line 2079
    invoke-virtual {v2, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v12

    .line 2083
    if-nez v12, :cond_52

    .line 2084
    .line 2085
    new-instance v12, Ljava/util/ArrayList;

    .line 2086
    .line 2087
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 2088
    .line 2089
    .line 2090
    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2091
    .line 2092
    .line 2093
    :cond_52
    check-cast v12, Ljava/util/List;

    .line 2094
    .line 2095
    invoke-interface {v12, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2096
    .line 2097
    .line 2098
    goto :goto_10

    .line 2099
    :cond_53
    new-instance v6, Ljava/util/ArrayList;

    .line 2100
    .line 2101
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 2102
    .line 2103
    .line 2104
    move-result v9

    .line 2105
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 2106
    .line 2107
    .line 2108
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v2

    .line 2112
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v2

    .line 2116
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2117
    .line 2118
    .line 2119
    move-result v9

    .line 2120
    if-eqz v9, :cond_55

    .line 2121
    .line 2122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2123
    .line 2124
    .line 2125
    move-result-object v9

    .line 2126
    check-cast v9, Ljava/util/Map$Entry;

    .line 2127
    .line 2128
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v10

    .line 2132
    check-cast v10, Ljava/lang/Number;

    .line 2133
    .line 2134
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 2135
    .line 2136
    .line 2137
    move-result v10

    .line 2138
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v9

    .line 2142
    check-cast v9, Ljava/util/List;

    .line 2143
    .line 2144
    new-instance v11, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 2145
    .line 2146
    invoke-direct {v11}, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;-><init>()V

    .line 2147
    .line 2148
    .line 2149
    invoke-virtual {v11, v10}, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;->setBookId(I)V

    .line 2150
    .line 2151
    .line 2152
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;->getItemIds()Ljava/util/ArrayList;

    .line 2153
    .line 2154
    .line 2155
    move-result-object v10

    .line 2156
    new-instance v12, Ljava/util/ArrayList;

    .line 2157
    .line 2158
    invoke-static {v9, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 2159
    .line 2160
    .line 2161
    move-result v13

    .line 2162
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 2163
    .line 2164
    .line 2165
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v9

    .line 2169
    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2170
    .line 2171
    .line 2172
    move-result v13

    .line 2173
    if-eqz v13, :cond_54

    .line 2174
    .line 2175
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v13

    .line 2179
    check-cast v13, Lp4/b;

    .line 2180
    .line 2181
    iget v13, v13, Lp4/b;->c:I

    .line 2182
    .line 2183
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v13

    .line 2187
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2188
    .line 2189
    .line 2190
    goto :goto_12

    .line 2191
    :cond_54
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2192
    .line 2193
    .line 2194
    new-instance v9, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$removeSelectedMistakes$requests$2$1;

    .line 2195
    .line 2196
    invoke-direct {v9, v1, v11, v8}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$removeSelectedMistakes$requests$2$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;Lh6/c;)V

    .line 2197
    .line 2198
    .line 2199
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2200
    .line 2201
    .line 2202
    goto :goto_11

    .line 2203
    :cond_55
    new-instance v2, Lcom/zykj/mistake/activity/o;

    .line 2204
    .line 2205
    move-object v3, v0

    .line 2206
    move-object v0, v2

    .line 2207
    const/4 v2, 0x2

    .line 2208
    move/from16 v35, v4

    .line 2209
    .line 2210
    move-object v4, v1

    .line 2211
    move/from16 v1, v35

    .line 2212
    .line 2213
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/activity/o;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2214
    .line 2215
    .line 2216
    move-object v1, v4

    .line 2217
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v2

    .line 2221
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;

    .line 2222
    .line 2223
    invoke-direct {v3, v1, v6, v0, v8}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/util/List;Lr6/a;Lh6/c;)V

    .line 2224
    .line 2225
    .line 2226
    invoke-static {v2, v8, v8, v3, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 2227
    .line 2228
    .line 2229
    return-void

    .line 2230
    :cond_56
    instance-of v2, v0, Lcom/zykj/mistake/feature/notebook/list/m0;

    .line 2231
    .line 2232
    if-eqz v2, :cond_57

    .line 2233
    .line 2234
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/m0;

    .line 2235
    .line 2236
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/m0;->a:Ljava/lang/String;

    .line 2237
    .line 2238
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v6

    .line 2242
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;

    .line 2243
    .line 2244
    const/4 v5, 0x0

    .line 2245
    const-wide/16 v3, 0x0

    .line 2246
    .line 2247
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/lang/String;JLh6/c;)V

    .line 2248
    .line 2249
    .line 2250
    invoke-static {v6, v8, v8, v0, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 2251
    .line 2252
    .line 2253
    return-void

    .line 2254
    :cond_57
    instance-of v1, v0, Lcom/zykj/mistake/feature/notebook/list/q0;

    .line 2255
    .line 2256
    if-eqz v1, :cond_58

    .line 2257
    .line 2258
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/q0;

    .line 2259
    .line 2260
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/q0;->b:Ljava/lang/String;

    .line 2261
    .line 2262
    iget-wide v3, v0, Lcom/zykj/mistake/feature/notebook/list/q0;->c:J

    .line 2263
    .line 2264
    invoke-static/range {p0 .. p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v6

    .line 2268
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;

    .line 2269
    .line 2270
    const/4 v5, 0x0

    .line 2271
    move-object/from16 v1, p0

    .line 2272
    .line 2273
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/lang/String;JLh6/c;)V

    .line 2274
    .line 2275
    .line 2276
    invoke-static {v6, v8, v8, v0, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 2277
    .line 2278
    .line 2279
    return-void

    .line 2280
    :cond_58
    move-object/from16 v1, p0

    .line 2281
    .line 2282
    instance-of v2, v0, Lcom/zykj/mistake/feature/notebook/list/l0;

    .line 2283
    .line 2284
    if-eqz v2, :cond_5e

    .line 2285
    .line 2286
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/l0;

    .line 2287
    .line 2288
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2289
    .line 2290
    .line 2291
    move-result-object v2

    .line 2292
    check-cast v2, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 2293
    .line 2294
    invoke-static {v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->g(Lcom/zykj/mistake/feature/notebook/list/e1;)Ljava/util/ArrayList;

    .line 2295
    .line 2296
    .line 2297
    move-result-object v4

    .line 2298
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2299
    .line 2300
    .line 2301
    move-result v5

    .line 2302
    if-eqz v5, :cond_59

    .line 2303
    .line 2304
    goto/16 :goto_18

    .line 2305
    .line 2306
    :cond_59
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 2307
    .line 2308
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2309
    .line 2310
    .line 2311
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 2312
    .line 2313
    .line 2314
    move-result v6

    .line 2315
    :goto_13
    if-ge v9, v6, :cond_5b

    .line 2316
    .line 2317
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v10

    .line 2321
    add-int/lit8 v9, v9, 0x1

    .line 2322
    .line 2323
    move-object v11, v10

    .line 2324
    check-cast v11, Lp4/b;

    .line 2325
    .line 2326
    iget v11, v11, Lp4/b;->b:I

    .line 2327
    .line 2328
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v11

    .line 2332
    invoke-virtual {v5, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v12

    .line 2336
    if-nez v12, :cond_5a

    .line 2337
    .line 2338
    new-instance v12, Ljava/util/ArrayList;

    .line 2339
    .line 2340
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 2341
    .line 2342
    .line 2343
    invoke-interface {v5, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2344
    .line 2345
    .line 2346
    :cond_5a
    check-cast v12, Ljava/util/List;

    .line 2347
    .line 2348
    invoke-interface {v12, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2349
    .line 2350
    .line 2351
    goto :goto_13

    .line 2352
    :cond_5b
    new-instance v4, Ljava/util/ArrayList;

    .line 2353
    .line 2354
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 2355
    .line 2356
    .line 2357
    move-result v6

    .line 2358
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 2359
    .line 2360
    .line 2361
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2362
    .line 2363
    .line 2364
    move-result-object v5

    .line 2365
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2366
    .line 2367
    .line 2368
    move-result-object v5

    .line 2369
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2370
    .line 2371
    .line 2372
    move-result v6

    .line 2373
    if-eqz v6, :cond_5d

    .line 2374
    .line 2375
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2376
    .line 2377
    .line 2378
    move-result-object v6

    .line 2379
    check-cast v6, Ljava/util/Map$Entry;

    .line 2380
    .line 2381
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2382
    .line 2383
    .line 2384
    move-result-object v9

    .line 2385
    check-cast v9, Ljava/lang/Number;

    .line 2386
    .line 2387
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 2388
    .line 2389
    .line 2390
    move-result v9

    .line 2391
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v6

    .line 2395
    check-cast v6, Ljava/util/List;

    .line 2396
    .line 2397
    new-instance v10, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 2398
    .line 2399
    invoke-direct {v10}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;-><init>()V

    .line 2400
    .line 2401
    .line 2402
    invoke-virtual {v10, v9}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setBookId(I)V

    .line 2403
    .line 2404
    .line 2405
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getItemIds()Ljava/util/ArrayList;

    .line 2406
    .line 2407
    .line 2408
    move-result-object v9

    .line 2409
    new-instance v11, Ljava/util/ArrayList;

    .line 2410
    .line 2411
    invoke-static {v6, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 2412
    .line 2413
    .line 2414
    move-result v12

    .line 2415
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2416
    .line 2417
    .line 2418
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v6

    .line 2422
    :goto_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2423
    .line 2424
    .line 2425
    move-result v12

    .line 2426
    if-eqz v12, :cond_5c

    .line 2427
    .line 2428
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2429
    .line 2430
    .line 2431
    move-result-object v12

    .line 2432
    check-cast v12, Lp4/b;

    .line 2433
    .line 2434
    iget v12, v12, Lp4/b;->c:I

    .line 2435
    .line 2436
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2437
    .line 2438
    .line 2439
    move-result-object v12

    .line 2440
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2441
    .line 2442
    .line 2443
    goto :goto_15

    .line 2444
    :cond_5c
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2445
    .line 2446
    .line 2447
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/list/l0;->a:Ljava/lang/Integer;

    .line 2448
    .line 2449
    invoke-virtual {v10, v6}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setDiff(Ljava/lang/Integer;)V

    .line 2450
    .line 2451
    .line 2452
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/list/l0;->b:Ljava/lang/Integer;

    .line 2453
    .line 2454
    invoke-virtual {v10, v6}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setAttainedLevel(Ljava/lang/Integer;)V

    .line 2455
    .line 2456
    .line 2457
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/list/l0;->c:Ljava/lang/Integer;

    .line 2458
    .line 2459
    invoke-virtual {v10, v6}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setErrorReason(Ljava/lang/Integer;)V

    .line 2460
    .line 2461
    .line 2462
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getTagIdList()Ljava/util/ArrayList;

    .line 2463
    .line 2464
    .line 2465
    move-result-object v6

    .line 2466
    iget-object v9, v0, Lcom/zykj/mistake/feature/notebook/list/l0;->d:Ljava/util/ArrayList;

    .line 2467
    .line 2468
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2469
    .line 2470
    .line 2471
    new-instance v6, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$setSelectedMistakeTags$requests$2$1;

    .line 2472
    .line 2473
    invoke-direct {v6, v1, v10, v8}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$setSelectedMistakeTags$requests$2$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/entity/req/MultiSetTagsReq;Lh6/c;)V

    .line 2474
    .line 2475
    .line 2476
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2477
    .line 2478
    .line 2479
    goto :goto_14

    .line 2480
    :cond_5d
    new-instance v3, Landroidx/lifecycle/compose/a;

    .line 2481
    .line 2482
    const/4 v5, 0x6

    .line 2483
    invoke-direct {v3, v2, v1, v5, v0}, Landroidx/lifecycle/compose/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2484
    .line 2485
    .line 2486
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2487
    .line 2488
    .line 2489
    move-result-object v0

    .line 2490
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;

    .line 2491
    .line 2492
    invoke-direct {v2, v1, v4, v3, v8}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/util/List;Lr6/a;Lh6/c;)V

    .line 2493
    .line 2494
    .line 2495
    invoke-static {v0, v8, v8, v2, v7}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 2496
    .line 2497
    .line 2498
    return-void

    .line 2499
    :cond_5e
    instance-of v2, v0, Lcom/zykj/mistake/feature/notebook/list/j0;

    .line 2500
    .line 2501
    if-eqz v2, :cond_60

    .line 2502
    .line 2503
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/j0;

    .line 2504
    .line 2505
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/list/j0;->a:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 2506
    .line 2507
    iput-object v0, v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 2508
    .line 2509
    :cond_5f
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2510
    .line 2511
    .line 2512
    move-result-object v0

    .line 2513
    move-object v7, v0

    .line 2514
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 2515
    .line 2516
    const/16 v30, 0x0

    .line 2517
    .line 2518
    const v31, 0x1ffff7f

    .line 2519
    .line 2520
    .line 2521
    const/4 v8, 0x0

    .line 2522
    const/4 v9, 0x0

    .line 2523
    const/4 v10, 0x0

    .line 2524
    const/4 v11, 0x0

    .line 2525
    const/4 v12, 0x0

    .line 2526
    const/4 v13, 0x0

    .line 2527
    const/4 v14, 0x0

    .line 2528
    const/4 v15, 0x0

    .line 2529
    const/16 v16, 0x0

    .line 2530
    .line 2531
    const/16 v17, 0x0

    .line 2532
    .line 2533
    const/16 v18, 0x0

    .line 2534
    .line 2535
    const/16 v19, 0x0

    .line 2536
    .line 2537
    const/16 v20, 0x0

    .line 2538
    .line 2539
    const/16 v21, 0x0

    .line 2540
    .line 2541
    const/16 v22, 0x0

    .line 2542
    .line 2543
    const/16 v23, 0x0

    .line 2544
    .line 2545
    const/16 v24, 0x0

    .line 2546
    .line 2547
    const/16 v25, 0x0

    .line 2548
    .line 2549
    const/16 v26, 0x0

    .line 2550
    .line 2551
    const/16 v27, 0x0

    .line 2552
    .line 2553
    const/16 v28, 0x0

    .line 2554
    .line 2555
    const/16 v29, 0x0

    .line 2556
    .line 2557
    invoke-static/range {v7 .. v31}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 2558
    .line 2559
    .line 2560
    move-result-object v2

    .line 2561
    invoke-virtual {v6, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2562
    .line 2563
    .line 2564
    move-result v0

    .line 2565
    if-eqz v0, :cond_5f

    .line 2566
    .line 2567
    invoke-virtual {v1, v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->f(Z)V

    .line 2568
    .line 2569
    .line 2570
    return-void

    .line 2571
    :cond_60
    instance-of v2, v0, Lcom/zykj/mistake/feature/notebook/list/g0;

    .line 2572
    .line 2573
    if-eqz v2, :cond_66

    .line 2574
    .line 2575
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2576
    .line 2577
    .line 2578
    move-result-object v2

    .line 2579
    check-cast v2, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 2580
    .line 2581
    iget-object v2, v2, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 2582
    .line 2583
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2584
    .line 2585
    .line 2586
    move-result-object v4

    .line 2587
    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2588
    .line 2589
    .line 2590
    move-result v5

    .line 2591
    if-eqz v5, :cond_62

    .line 2592
    .line 2593
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2594
    .line 2595
    .line 2596
    move-result-object v5

    .line 2597
    check-cast v5, Lp4/b;

    .line 2598
    .line 2599
    iget-object v5, v5, Lp4/b;->a:Ljava/lang/String;

    .line 2600
    .line 2601
    move-object v6, v0

    .line 2602
    check-cast v6, Lcom/zykj/mistake/feature/notebook/list/g0;

    .line 2603
    .line 2604
    iget-object v6, v6, Lcom/zykj/mistake/feature/notebook/list/g0;->a:Ljava/lang/String;

    .line 2605
    .line 2606
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2607
    .line 2608
    .line 2609
    move-result v5

    .line 2610
    if-eqz v5, :cond_61

    .line 2611
    .line 2612
    goto :goto_17

    .line 2613
    :cond_61
    add-int/lit8 v9, v9, 0x1

    .line 2614
    .line 2615
    goto :goto_16

    .line 2616
    :cond_62
    const/4 v9, -0x1

    .line 2617
    :goto_17
    if-gez v9, :cond_64

    .line 2618
    .line 2619
    :cond_63
    :goto_18
    return-void

    .line 2620
    :cond_64
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2621
    .line 2622
    .line 2623
    move-result-object v0

    .line 2624
    check-cast v0, Lp4/b;

    .line 2625
    .line 2626
    new-instance v4, Ljava/util/ArrayList;

    .line 2627
    .line 2628
    invoke-static {v2, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 2629
    .line 2630
    .line 2631
    move-result v3

    .line 2632
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2633
    .line 2634
    .line 2635
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v2

    .line 2639
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2640
    .line 2641
    .line 2642
    move-result v3

    .line 2643
    if-eqz v3, :cond_65

    .line 2644
    .line 2645
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2646
    .line 2647
    .line 2648
    move-result-object v3

    .line 2649
    check-cast v3, Lp4/b;

    .line 2650
    .line 2651
    invoke-static {v3}, La/a;->q(Lp4/b;)Lp4/e;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v3

    .line 2655
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2656
    .line 2657
    .line 2658
    goto :goto_19

    .line 2659
    :cond_65
    new-instance v10, Lcom/zykj/mistake/feature/notebook/list/r;

    .line 2660
    .line 2661
    iget v11, v0, Lp4/b;->b:I

    .line 2662
    .line 2663
    iget v12, v0, Lp4/b;->c:I

    .line 2664
    .line 2665
    iget-wide v13, v0, Lp4/b;->d:J

    .line 2666
    .line 2667
    iget-object v15, v0, Lp4/b;->f:Ljava/lang/String;

    .line 2668
    .line 2669
    iget-object v2, v0, Lp4/b;->g:Ljava/lang/String;

    .line 2670
    .line 2671
    iget-object v3, v0, Lp4/b;->h:Ljava/lang/String;

    .line 2672
    .line 2673
    iget-object v5, v0, Lp4/b;->i:Ljava/lang/String;

    .line 2674
    .line 2675
    iget-boolean v6, v0, Lp4/b;->l:Z

    .line 2676
    .line 2677
    iget-boolean v7, v0, Lp4/b;->j:Z

    .line 2678
    .line 2679
    iget-boolean v8, v0, Lp4/b;->k:Z

    .line 2680
    .line 2681
    iget-object v0, v0, Lp4/b;->p:Ljava/util/List;

    .line 2682
    .line 2683
    move-object/from16 v22, v0

    .line 2684
    .line 2685
    move-object/from16 v16, v2

    .line 2686
    .line 2687
    move-object/from16 v17, v3

    .line 2688
    .line 2689
    move-object/from16 v23, v4

    .line 2690
    .line 2691
    move-object/from16 v18, v5

    .line 2692
    .line 2693
    move/from16 v19, v6

    .line 2694
    .line 2695
    move/from16 v20, v7

    .line 2696
    .line 2697
    move/from16 v21, v8

    .line 2698
    .line 2699
    move/from16 v24, v9

    .line 2700
    .line 2701
    invoke-direct/range {v10 .. v24}, Lcom/zykj/mistake/feature/notebook/list/r;-><init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;Ljava/util/ArrayList;I)V

    .line 2702
    .line 2703
    .line 2704
    invoke-virtual {v1, v10}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 2705
    .line 2706
    .line 2707
    return-void

    .line 2708
    :cond_66
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/r0;->a:Lcom/zykj/mistake/feature/notebook/list/r0;

    .line 2709
    .line 2710
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2711
    .line 2712
    .line 2713
    move-result v0

    .line 2714
    if-eqz v0, :cond_68

    .line 2715
    .line 2716
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2717
    .line 2718
    .line 2719
    move-result-object v0

    .line 2720
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 2721
    .line 2722
    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->n:Z

    .line 2723
    .line 2724
    if-eqz v2, :cond_67

    .line 2725
    .line 2726
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/p;

    .line 2727
    .line 2728
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->k:Ljava/util/List;

    .line 2729
    .line 2730
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->m:Ljava/util/List;

    .line 2731
    .line 2732
    invoke-direct {v2, v3, v0}, Lcom/zykj/mistake/feature/notebook/list/p;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 2733
    .line 2734
    .line 2735
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 2736
    .line 2737
    .line 2738
    return-void

    .line 2739
    :cond_67
    invoke-virtual {v1, v5, v5, v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->e(ZZZ)V

    .line 2740
    .line 2741
    .line 2742
    return-void

    .line 2743
    :cond_68
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 2744
    .line 2745
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 2746
    .line 2747
    .line 2748
    throw v0
.end method

.method public final e(ZZZ)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->j:Lkotlinx/coroutines/k1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/c1;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->k:I

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    move-object v4, p0

    .line 22
    move v5, p1

    .line 23
    move v3, p2

    .line 24
    move v6, p3

    .line 25
    invoke-direct/range {v2 .. v7}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;-><init>(ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;ZZLh6/c;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    invoke-static {v0, v1, v1, v2, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, v4, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->j:Lkotlinx/coroutines/k1;

    .line 34
    .line 35
    return-void
.end method

.method public final f(Z)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 6
    .line 7
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 12
    .line 13
    iget v4, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->k:I

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    const/16 v4, 0x14

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->i:Lkotlinx/coroutines/k1;

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v3, v5}, Lkotlinx/coroutines/c1;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-virtual {v3, v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setSkipCount(I)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setMaxResultCount(I)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    move-object v6, v3

    .line 47
    check-cast v6, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 48
    .line 49
    sget-object v15, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 50
    .line 51
    const/16 v29, 0x0

    .line 52
    .line 53
    const v30, 0x1fffcaf

    .line 54
    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    const/4 v11, 0x1

    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x1

    .line 63
    const/4 v14, 0x0

    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    const/16 v17, 0x0

    .line 67
    .line 68
    const/16 v18, 0x0

    .line 69
    .line 70
    const/16 v19, 0x0

    .line 71
    .line 72
    const/16 v20, 0x0

    .line 73
    .line 74
    const/16 v21, 0x0

    .line 75
    .line 76
    const/16 v22, 0x0

    .line 77
    .line 78
    const/16 v23, 0x0

    .line 79
    .line 80
    const/16 v24, 0x0

    .line 81
    .line 82
    const/16 v25, 0x0

    .line 83
    .line 84
    const/16 v26, 0x0

    .line 85
    .line 86
    const/16 v27, 0x0

    .line 87
    .line 88
    const/16 v28, 0x0

    .line 89
    .line 90
    invoke-static/range {v6 .. v30}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v2, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_2

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    iget-boolean v6, v3, Lcom/zykj/mistake/feature/notebook/list/e1;->e:Z

    .line 102
    .line 103
    if-nez v6, :cond_6

    .line 104
    .line 105
    iget-boolean v6, v3, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    .line 106
    .line 107
    if-eqz v6, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 111
    .line 112
    iget-object v3, v3, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {v6, v3}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setSkipCount(I)V

    .line 119
    .line 120
    .line 121
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 122
    .line 123
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setMaxResultCount(I)V

    .line 124
    .line 125
    .line 126
    :cond_5
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    move-object v6, v3

    .line 131
    check-cast v6, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 132
    .line 133
    const/16 v29, 0x0

    .line 134
    .line 135
    const v30, 0x1ffffdf

    .line 136
    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    const/4 v8, 0x0

    .line 140
    const/4 v9, 0x0

    .line 141
    const/4 v10, 0x0

    .line 142
    const/4 v11, 0x0

    .line 143
    const/4 v12, 0x1

    .line 144
    const/4 v13, 0x0

    .line 145
    const/4 v14, 0x0

    .line 146
    const/4 v15, 0x0

    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    const/16 v18, 0x0

    .line 152
    .line 153
    const/16 v19, 0x0

    .line 154
    .line 155
    const/16 v20, 0x0

    .line 156
    .line 157
    const/16 v21, 0x0

    .line 158
    .line 159
    const/16 v22, 0x0

    .line 160
    .line 161
    const/16 v23, 0x0

    .line 162
    .line 163
    const/16 v24, 0x0

    .line 164
    .line 165
    const/16 v25, 0x0

    .line 166
    .line 167
    const/16 v26, 0x0

    .line 168
    .line 169
    const/16 v27, 0x0

    .line 170
    .line 171
    const/16 v28, 0x0

    .line 172
    .line 173
    invoke-static/range {v6 .. v30}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v2, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-eqz v3, :cond_5

    .line 182
    .line 183
    :goto_0
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 184
    .line 185
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getSkipCount()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    new-instance v4, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;

    .line 194
    .line 195
    invoke-direct {v4, v0, v2, v1, v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;IZLh6/c;)V

    .line 196
    .line 197
    .line 198
    const/4 v1, 0x3

    .line 199
    invoke-static {v3, v5, v5, v4, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->i:Lkotlinx/coroutines/k1;

    .line 204
    .line 205
    :cond_6
    :goto_1
    return-void
.end method

.method public final h(Lcom/zykj/mistake/feature/notebook/list/y;)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$sendEffect$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$sendEffect$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/feature/notebook/list/y;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method
