# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class public final Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;
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
        "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;",
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
        "SMAP\nMistakeCollectionDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,663:1\n230#2,3:664\n233#2,2:668\n230#2,5:670\n230#2,5:675\n230#2,5:680\n230#2,5:685\n230#2,5:690\n230#2,5:695\n230#2,5:700\n230#2,5:705\n230#2,5:710\n230#2,5:715\n230#2,5:720\n230#2,5:725\n230#2,5:730\n230#2,5:735\n230#2,5:740\n230#2,5:745\n230#2,5:750\n230#2,5:755\n230#2,5:760\n230#2,5:765\n230#2,5:770\n230#2,5:775\n230#2,5:780\n230#2,5:785\n230#2,5:790\n230#2,5:795\n230#2,5:800\n230#2,5:805\n230#2,5:810\n230#2,5:830\n230#2,5:842\n230#2,3:847\n233#2,2:857\n230#2,5:859\n230#2,5:872\n230#2,5:877\n1#3:667\n1563#4:815\n1634#4,3:816\n360#4,7:819\n1563#4:826\n1634#4,3:827\n774#4:835\n865#4,2:836\n1563#4:838\n1634#4,3:839\n1788#4,4:850\n827#4:854\n855#4,2:855\n1563#4:864\n1634#4,3:865\n1563#4:868\n1634#4,3:869\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel\n*L\n52#1:664,3\n52#1:668,2\n114#1:670,5\n141#1:675,5\n151#1:680,5\n161#1:685,5\n172#1:690,5\n180#1:695,5\n190#1:700,5\n201#1:705,5\n205#1:710,5\n225#1:715,5\n228#1:720,5\n245#1:725,5\n248#1:730,5\n258#1:735,5\n271#1:740,5\n300#1:745,5\n304#1:750,5\n307#1:755,5\n316#1:760,5\n319#1:765,5\n322#1:770,5\n325#1:775,5\n328#1:780,5\n331#1:785,5\n334#1:790,5\n337#1:795,5\n362#1:800,5\n385#1:805,5\n395#1:810,5\n506#1:830,5\n552#1:842,5\n573#1:847,3\n573#1:857,2\n600#1:859,5\n616#1:872,5\n625#1:877,5\n448#1:815\n448#1:816,3\n474#1:819,7\n477#1:826\n477#1:827,3\n549#1:835\n549#1:836,2\n550#1:838\n550#1:839,3\n574#1:850,4\n575#1:854\n575#1:855,2\n604#1:864\n604#1:865,3\n610#1:868\n610#1:869,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/mistake/data/a;

.field public final b:Lo2/a;

.field public final c:Lkotlinx/coroutines/flow/n0;

.field public final d:Lkotlinx/coroutines/flow/a0;

.field public final e:Lkotlinx/coroutines/channels/b;

.field public final f:Lkotlinx/coroutines/flow/c;


# direct methods
# RE I/O 读取布尔偏好（SharedPreferences.getBoolean）。
.method public constructor <init>(Landroid/app/Application;)V
    .locals 41
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "application"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct/range {p0 .. p1}, Landroidx/lifecycle/AndroidViewModel;-><init>(Landroid/app/Application;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lcom/zykj/mistake/data/a;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, v3}, Lcom/zykj/mistake/data/a;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->a:Lcom/zykj/mistake/data/a;

    .line 20
    .line 21
    new-instance v2, Lo2/a;

    .line 22
    .line 23
    const/16 v3, 0xa

    .line 24
    .line 25
    invoke-direct {v2, v3}, Lo2/a;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->b:Lo2/a;

    .line 29
    .line 30
    new-instance v4, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 31
    .line 32
    const-string v2, "zykjMistake"

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "SP_CONTACT_MODE"

    .line 40
    .line 41
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    sget-object v8, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->EXISTING:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 46
    .line 47
    sget-object v10, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->INITIAL_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 48
    .line 49
    sget-object v11, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 50
    .line 51
    sget-object v23, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 52
    .line 53
    const/16 v39, 0x0

    .line 54
    .line 55
    const/16 v40, 0x0

    .line 56
    .line 57
    const-string v5, ""

    .line 58
    .line 59
    const-string v6, "\u9519\u9898\u96c6"

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v13, 0x0

    .line 64
    const/4 v14, 0x0

    .line 65
    const/4 v15, 0x0

    .line 66
    const/16 v16, 0x1

    .line 67
    .line 68
    const/16 v19, 0x1

    .line 69
    .line 70
    const/16 v20, 0x0

    .line 71
    .line 72
    const/16 v21, 0x0

    .line 73
    .line 74
    const/16 v22, 0x0

    .line 75
    .line 76
    const/16 v24, 0x0

    .line 77
    .line 78
    const/16 v25, 0x0

    .line 79
    .line 80
    const/16 v26, 0x0

    .line 81
    .line 82
    const/16 v27, 0x0

    .line 83
    .line 84
    const/16 v28, 0x1

    .line 85
    .line 86
    const/16 v29, 0x0

    .line 87
    .line 88
    const/16 v30, 0x0

    .line 89
    .line 90
    const/16 v32, 0x0

    .line 91
    .line 92
    const/16 v33, 0x0

    .line 93
    .line 94
    const/16 v36, 0x0

    .line 95
    .line 96
    const/16 v37, 0x0

    .line 97
    .line 98
    move-object/from16 v17, v11

    .line 99
    .line 100
    move-object/from16 v18, v11

    .line 101
    .line 102
    move-object/from16 v31, v23

    .line 103
    .line 104
    move-object/from16 v34, v5

    .line 105
    .line 106
    move-object/from16 v35, v5

    .line 107
    .line 108
    move-object/from16 v38, v23

    .line 109
    .line 110
    invoke-direct/range {v4 .. v40}, Lcom/zykj/mistake/feature/collection/detail/z0;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZ)V

    .line 111
    .line 112
    .line 113
    invoke-static {v4}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 118
    .line 119
    new-instance v2, Lkotlinx/coroutines/flow/a0;

    .line 120
    .line 121
    invoke-direct {v2, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 122
    .line 123
    .line 124
    iput-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->d:Lkotlinx/coroutines/flow/a0;

    .line 125
    .line 126
    const/4 v1, 0x7

    .line 127
    const/4 v2, 0x0

    .line 128
    invoke-static {v3, v1, v2}, Lkotlinx/coroutines/channels/k;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/b;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iput-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->e:Lkotlinx/coroutines/channels/b;

    .line 133
    .line 134
    invoke-static {v1}, Lkotlinx/coroutines/flow/h;->l(Lkotlinx/coroutines/channels/b;)Lkotlinx/coroutines/flow/c;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iput-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->f:Lkotlinx/coroutines/flow/c;

    .line 139
    .line 140
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 10
    .line 11
    iget-boolean v3, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->I:Z

    .line 12
    .line 13
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    .line 14
    .line 15
    if-nez v3, :cond_5

    .line 16
    .line 17
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    iget-object v3, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v3}, Lkotlin/text/w;->D(Ljava/lang/String;)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_5

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v2, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 38
    .line 39
    new-instance v5, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    move-object v7, v6

    .line 59
    check-cast v7, Lp4/b;

    .line 60
    .line 61
    iget-object v7, v7, Lp4/b;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {v4, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_1

    .line 68
    .line 69
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 74
    .line 75
    const/16 v4, 0xa

    .line 76
    .line 77
    invoke-static {v5, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const/4 v6, 0x0

    .line 89
    :goto_1
    if-ge v6, v4, :cond_3

    .line 90
    .line 91
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    add-int/lit8 v6, v6, 0x1

    .line 96
    .line 97
    check-cast v7, Lp4/b;

    .line 98
    .line 99
    iget v7, v7, Lp4/b;->c:I

    .line 100
    .line 101
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    move-object v5, v4

    .line 121
    check-cast v5, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 122
    .line 123
    const/16 v42, -0x1

    .line 124
    .line 125
    const/16 v43, 0x7

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    const/4 v7, 0x0

    .line 129
    const/4 v8, 0x0

    .line 130
    const/4 v9, 0x0

    .line 131
    const/4 v10, 0x0

    .line 132
    const/4 v11, 0x0

    .line 133
    const/4 v12, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    const/4 v14, 0x0

    .line 136
    const/4 v15, 0x0

    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    const/16 v17, 0x0

    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const/16 v19, 0x0

    .line 144
    .line 145
    const/16 v20, 0x0

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const/16 v22, 0x0

    .line 150
    .line 151
    const/16 v23, 0x0

    .line 152
    .line 153
    const/16 v24, 0x0

    .line 154
    .line 155
    const/16 v25, 0x0

    .line 156
    .line 157
    const/16 v26, 0x0

    .line 158
    .line 159
    const/16 v27, 0x0

    .line 160
    .line 161
    const/16 v28, 0x0

    .line 162
    .line 163
    const/16 v29, 0x0

    .line 164
    .line 165
    const/16 v30, 0x0

    .line 166
    .line 167
    const/16 v31, 0x0

    .line 168
    .line 169
    const/16 v32, 0x0

    .line 170
    .line 171
    const/16 v33, 0x0

    .line 172
    .line 173
    const/16 v34, 0x0

    .line 174
    .line 175
    const/16 v35, 0x0

    .line 176
    .line 177
    const/16 v36, 0x0

    .line 178
    .line 179
    const/16 v37, 0x0

    .line 180
    .line 181
    const/16 v38, 0x0

    .line 182
    .line 183
    const/16 v39, 0x0

    .line 184
    .line 185
    const/16 v40, 0x1

    .line 186
    .line 187
    const/16 v41, 0x0

    .line 188
    .line 189
    invoke-static/range {v5 .. v43}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-virtual {v1, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v4, :cond_4

    .line 198
    .line 199
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    new-instance v4, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;

    .line 204
    .line 205
    const/4 v5, 0x0

    .line 206
    invoke-direct {v4, v0, v3, v2, v5}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;ILjava/util/List;Lh6/c;)V

    .line 207
    .line 208
    .line 209
    const/4 v2, 0x3

    .line 210
    invoke-static {v1, v5, v5, v4, v2}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 211
    .line 212
    .line 213
    :cond_5
    :goto_2
    return-void
.end method

.method public final b()V
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 10
    .line 11
    iget-object v2, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->D:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 26
    .line 27
    iget-boolean v3, v3, Lcom/zykj/mistake/feature/collection/detail/z0;->F:Z

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/4 v4, 0x3

    .line 37
    const/4 v5, 0x0

    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$1;

    .line 45
    .line 46
    invoke-direct {v2, v0, v5}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$1;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lh6/c;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v5, v5, v2, v4}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    move-object v6, v3

    .line 58
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 59
    .line 60
    const v43, 0x7fffffff

    .line 61
    .line 62
    .line 63
    const/16 v44, 0x1e

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    const/4 v8, 0x0

    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v12, 0x0

    .line 71
    const/4 v13, 0x0

    .line 72
    const/4 v14, 0x0

    .line 73
    const/4 v15, 0x0

    .line 74
    const/16 v16, 0x0

    .line 75
    .line 76
    const/16 v17, 0x0

    .line 77
    .line 78
    const/16 v18, 0x0

    .line 79
    .line 80
    const/16 v19, 0x0

    .line 81
    .line 82
    const/16 v20, 0x0

    .line 83
    .line 84
    const/16 v21, 0x0

    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const/16 v23, 0x0

    .line 89
    .line 90
    const/16 v24, 0x0

    .line 91
    .line 92
    const/16 v25, 0x0

    .line 93
    .line 94
    const/16 v26, 0x0

    .line 95
    .line 96
    const/16 v27, 0x0

    .line 97
    .line 98
    const/16 v28, 0x0

    .line 99
    .line 100
    const/16 v29, 0x0

    .line 101
    .line 102
    const/16 v30, 0x0

    .line 103
    .line 104
    const/16 v31, 0x0

    .line 105
    .line 106
    const/16 v32, 0x0

    .line 107
    .line 108
    const/16 v33, 0x0

    .line 109
    .line 110
    const/16 v34, 0x0

    .line 111
    .line 112
    const/16 v35, 0x0

    .line 113
    .line 114
    const/16 v36, 0x0

    .line 115
    .line 116
    const-string v37, ""

    .line 117
    .line 118
    const/16 v38, 0x1

    .line 119
    .line 120
    const/16 v39, 0x0

    .line 121
    .line 122
    const/16 v40, 0x0

    .line 123
    .line 124
    const/16 v41, 0x0

    .line 125
    .line 126
    const/16 v42, 0x0

    .line 127
    .line 128
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v1, v3, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_1

    .line 137
    .line 138
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;

    .line 143
    .line 144
    invoke-direct {v3, v0, v2, v5}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Ljava/lang/String;Lh6/c;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v5, v5, v3, v4}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final c()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 8
    .line 9
    new-instance v5, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 10
    .line 11
    invoke-direct {v5}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/text/w;->D(Ljava/lang/String;)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v5, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setCollectionId(Ljava/lang/Integer;)V

    .line 21
    .line 22
    .line 23
    iget v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->o:I

    .line 24
    .line 25
    invoke-virtual {v5, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setTimeRange(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTimeRange()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x3

    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    .line 35
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->p:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v5, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setStartTime(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->q:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v5, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setEndTime(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTopicIds()Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->s:Ljava/util/Set;

    .line 50
    .line 51
    check-cast v2, Ljava/util/Collection;

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->t:Ljava/lang/Integer;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getDiff()Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_1
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->u:Ljava/lang/Integer;

    .line 76
    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_2
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->v:Ljava/lang/Integer;

    .line 95
    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getErrorReason()Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_3
    iget v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    .line 114
    .line 115
    invoke-virtual {v5, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setCurrentCollectionStatus(I)V

    .line 116
    .line 117
    .line 118
    iget v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    .line 119
    .line 120
    invoke-virtual {v5, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setOtherCollectionStatus(I)V

    .line 121
    .line 122
    .line 123
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->z:Z

    .line 124
    .line 125
    const/4 v2, 0x0

    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTagIdList()Ljava/util/ArrayList;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_4
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTagIdList()Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->A:Ljava/util/Set;

    .line 144
    .line 145
    check-cast v3, Ljava/lang/Iterable;

    .line 146
    .line 147
    new-instance v4, Ljava/util/ArrayList;

    .line 148
    .line 149
    const/16 v6, 0xa

    .line 150
    .line 151
    invoke-static {v3, v6}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_5

    .line 167
    .line 168
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    check-cast v6, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    long-to-int v6, v6

    .line 179
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_5
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setSortType(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v5, v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setSkipCount(I)V

    .line 194
    .line 195
    .line 196
    const/16 v1, 0x14

    .line 197
    .line 198
    invoke-virtual {v5, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setMaxResultCount(I)V

    .line 199
    .line 200
    .line 201
    new-instance v1, Lcom/zykj/mistake/feature/collection/detail/i;

    .line 202
    .line 203
    move v3, v2

    .line 204
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    .line 205
    .line 206
    move v4, v3

    .line 207
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->b:Ljava/lang/String;

    .line 208
    .line 209
    move v6, v4

    .line 210
    iget v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    .line 211
    .line 212
    move v7, v6

    .line 213
    iget v6, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    .line 214
    .line 215
    move v8, v7

    .line 216
    iget v7, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    .line 217
    .line 218
    iget-object v9, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->f:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 219
    .line 220
    sget-object v10, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->ADD_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 221
    .line 222
    if-ne v9, v10, :cond_6

    .line 223
    .line 224
    const/4 v8, 0x1

    .line 225
    :cond_6
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 226
    .line 227
    sget-object v9, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->CREATED:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 228
    .line 229
    if-ne v0, v9, :cond_7

    .line 230
    .line 231
    sget-object v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;->CREATE_COLLECTION:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 232
    .line 233
    :goto_1
    move-object v9, v0

    .line 234
    goto :goto_2

    .line 235
    :cond_7
    sget-object v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;->EXISTING_COLLECTION_ADD:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 236
    .line 237
    goto :goto_1

    .line 238
    :goto_2
    invoke-direct/range {v1 .. v9}, Lcom/zykj/mistake/feature/collection/detail/i;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;IIZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v1}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->j(Lcom/zykj/mistake/feature/collection/detail/m;)V

    .line 242
    .line 243
    .line 244
    return-void
.end method

.method public final d(Lcom/zykj/mistake/feature/collection/detail/y0;)V
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/f0;

    .line 6
    .line 7
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 8
    .line 9
    if-eqz v2, :cond_15

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    move-object v6, v2

    .line 16
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 17
    .line 18
    invoke-virtual {v6}, Lcom/zykj/mistake/feature/collection/detail/z0;->b()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    iget-boolean v8, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->j:Z

    .line 23
    .line 24
    iget-boolean v9, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->i:Z

    .line 25
    .line 26
    move-object v10, v1

    .line 27
    check-cast v10, Lcom/zykj/mistake/feature/collection/detail/f0;

    .line 28
    .line 29
    iget-object v11, v10, Lcom/zykj/mistake/feature/collection/detail/f0;->b:Ljava/lang/String;

    .line 30
    .line 31
    iget v12, v10, Lcom/zykj/mistake/feature/collection/detail/f0;->c:I

    .line 32
    .line 33
    iget-object v13, v10, Lcom/zykj/mistake/feature/collection/detail/f0;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_2

    .line 40
    .line 41
    if-nez v9, :cond_1

    .line 42
    .line 43
    if-nez v8, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/16 v45, 0x0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    const/16 v45, 0x1

    .line 50
    .line 51
    :goto_1
    if-eqz v7, :cond_3

    .line 52
    .line 53
    iget-object v13, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 54
    .line 55
    sget-object v14, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->EXISTING:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 56
    .line 57
    if-ne v13, v14, :cond_3

    .line 58
    .line 59
    const/4 v13, 0x1

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    const/4 v13, 0x0

    .line 62
    :goto_2
    if-eqz v13, :cond_4

    .line 63
    .line 64
    sget-object v14, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->EXISTING:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    invoke-virtual {v10}, Lcom/zykj/mistake/feature/collection/detail/f0;->a()Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 68
    .line 69
    .line 70
    move-result-object v14

    .line 71
    :goto_3
    sget-object v15, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->CREATED:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 72
    .line 73
    if-ne v14, v15, :cond_5

    .line 74
    .line 75
    const/4 v15, 0x1

    .line 76
    goto :goto_4

    .line 77
    :cond_5
    const/4 v15, 0x0

    .line 78
    :goto_4
    if-eqz v13, :cond_7

    .line 79
    .line 80
    :cond_6
    move-object v13, v11

    .line 81
    const/4 v11, 0x0

    .line 82
    goto :goto_5

    .line 83
    :cond_7
    if-nez v15, :cond_8

    .line 84
    .line 85
    if-nez v12, :cond_6

    .line 86
    .line 87
    :cond_8
    move-object v13, v11

    .line 88
    const/4 v11, 0x1

    .line 89
    :goto_5
    if-eqz v15, :cond_9

    .line 90
    .line 91
    sget-object v16, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->INITIAL_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 92
    .line 93
    :goto_6
    move-object/from16 v3, v16

    .line 94
    .line 95
    goto :goto_7

    .line 96
    :cond_9
    sget-object v16, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->ADD_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 97
    .line 98
    goto :goto_6

    .line 99
    :goto_7
    iget-object v10, v10, Lcom/zykj/mistake/feature/collection/detail/f0;->a:Ljava/lang/String;

    .line 100
    .line 101
    if-eqz v7, :cond_a

    .line 102
    .line 103
    iget-object v4, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->b:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v4}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v16

    .line 109
    if-eqz v16, :cond_b

    .line 110
    .line 111
    :cond_a
    move-object v4, v13

    .line 112
    :cond_b
    if-eqz v7, :cond_c

    .line 113
    .line 114
    iget v13, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    .line 115
    .line 116
    if-ge v12, v13, :cond_c

    .line 117
    .line 118
    move v12, v13

    .line 119
    :cond_c
    if-eqz v11, :cond_e

    .line 120
    .line 121
    sget-object v13, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->ADD_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 122
    .line 123
    if-ne v3, v13, :cond_d

    .line 124
    .line 125
    const/4 v13, 0x1

    .line 126
    goto :goto_8

    .line 127
    :cond_d
    const/4 v13, 0x0

    .line 128
    :goto_8
    move/from16 v29, v13

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_e
    iget v13, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    .line 132
    .line 133
    goto :goto_8

    .line 134
    :goto_9
    if-eqz v11, :cond_10

    .line 135
    .line 136
    if-eqz v15, :cond_f

    .line 137
    .line 138
    const/16 v30, 0x1

    .line 139
    .line 140
    goto :goto_a

    .line 141
    :cond_f
    const/16 v30, 0x0

    .line 142
    .line 143
    goto :goto_a

    .line 144
    :cond_10
    iget v13, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    .line 145
    .line 146
    move/from16 v30, v13

    .line 147
    .line 148
    :goto_a
    if-eqz v7, :cond_11

    .line 149
    .line 150
    iget-boolean v13, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->y:Z

    .line 151
    .line 152
    move/from16 v31, v13

    .line 153
    .line 154
    goto :goto_b

    .line 155
    :cond_11
    move/from16 v31, v11

    .line 156
    .line 157
    :goto_b
    if-eqz v7, :cond_12

    .line 158
    .line 159
    invoke-virtual {v6}, Lcom/zykj/mistake/feature/collection/detail/z0;->g()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    goto :goto_c

    .line 164
    :cond_12
    invoke-static {}, Lkotlin/collections/u;->s()Lkotlin/collections/EmptyList;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    :goto_c
    if-eqz v7, :cond_13

    .line 169
    .line 170
    move v15, v9

    .line 171
    goto :goto_d

    .line 172
    :cond_13
    const/4 v15, 0x0

    .line 173
    :goto_d
    if-eqz v45, :cond_14

    .line 174
    .line 175
    const/16 v16, 0x1

    .line 176
    .line 177
    goto :goto_e

    .line 178
    :cond_14
    move/from16 v16, v8

    .line 179
    .line 180
    :goto_e
    invoke-static {}, Lkotlin/collections/j0;->v()Lkotlin/collections/EmptySet;

    .line 181
    .line 182
    .line 183
    move-result-object v40

    .line 184
    const v43, -0x3800ef8

    .line 185
    .line 186
    .line 187
    const/16 v44, 0x19

    .line 188
    .line 189
    move-object v7, v10

    .line 190
    move-object v10, v14

    .line 191
    const/4 v14, 0x0

    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const/16 v18, 0x0

    .line 195
    .line 196
    const/16 v19, 0x0

    .line 197
    .line 198
    const/16 v20, 0x0

    .line 199
    .line 200
    const/16 v21, 0x0

    .line 201
    .line 202
    const/16 v22, 0x0

    .line 203
    .line 204
    const/16 v23, 0x0

    .line 205
    .line 206
    const/16 v24, 0x0

    .line 207
    .line 208
    const/16 v25, 0x0

    .line 209
    .line 210
    const/16 v26, 0x0

    .line 211
    .line 212
    const/16 v27, 0x0

    .line 213
    .line 214
    const/16 v28, 0x0

    .line 215
    .line 216
    const/16 v32, 0x0

    .line 217
    .line 218
    const/16 v33, 0x0

    .line 219
    .line 220
    const/16 v34, 0x0

    .line 221
    .line 222
    const/16 v35, 0x0

    .line 223
    .line 224
    const/16 v36, 0x0

    .line 225
    .line 226
    const/16 v37, 0x0

    .line 227
    .line 228
    const/16 v38, 0x0

    .line 229
    .line 230
    const/16 v39, 0x0

    .line 231
    .line 232
    const/16 v41, 0x0

    .line 233
    .line 234
    const/16 v42, 0x0

    .line 235
    .line 236
    move-object v8, v4

    .line 237
    move v9, v12

    .line 238
    move-object v12, v3

    .line 239
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-eqz v2, :cond_0

    .line 248
    .line 249
    if-eqz v45, :cond_5d

    .line 250
    .line 251
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->e()V

    .line 252
    .line 253
    .line 254
    const/4 v1, 0x1

    .line 255
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->h(Z)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_15
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/p;->a:Lcom/zykj/mistake/feature/collection/detail/p;

    .line 260
    .line 261
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    const/4 v3, 0x3

    .line 266
    if-eqz v2, :cond_16

    .line 267
    .line 268
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$dispatch$2;

    .line 273
    .line 274
    const/4 v4, 0x0

    .line 275
    invoke-direct {v2, v0, v4}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$dispatch$2;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lh6/c;)V

    .line 276
    .line 277
    .line 278
    invoke-static {v1, v4, v4, v2, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_16
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/o;->a:Lcom/zykj/mistake/feature/collection/detail/o;

    .line 283
    .line 284
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-eqz v2, :cond_1e

    .line 289
    .line 290
    :cond_17
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    move-object v6, v1

    .line 295
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 296
    .line 297
    iget-object v2, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 298
    .line 299
    sget-object v3, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->CREATED:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 300
    .line 301
    if-ne v2, v3, :cond_18

    .line 302
    .line 303
    const/4 v2, 0x1

    .line 304
    goto :goto_f

    .line 305
    :cond_18
    const/4 v2, 0x0

    .line 306
    :goto_f
    if-eqz v2, :cond_19

    .line 307
    .line 308
    sget-object v3, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->INITIAL_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 309
    .line 310
    :goto_10
    move-object v12, v3

    .line 311
    goto :goto_11

    .line 312
    :cond_19
    sget-object v3, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->ADD_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 313
    .line 314
    goto :goto_10

    .line 315
    :goto_11
    iget-boolean v3, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->y:Z

    .line 316
    .line 317
    if-nez v3, :cond_1b

    .line 318
    .line 319
    sget-object v4, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->ADD_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 320
    .line 321
    if-ne v12, v4, :cond_1a

    .line 322
    .line 323
    const/4 v4, 0x1

    .line 324
    goto :goto_12

    .line 325
    :cond_1a
    const/4 v4, 0x0

    .line 326
    :goto_12
    move/from16 v29, v4

    .line 327
    .line 328
    goto :goto_13

    .line 329
    :cond_1b
    iget v4, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    .line 330
    .line 331
    goto :goto_12

    .line 332
    :goto_13
    if-nez v3, :cond_1d

    .line 333
    .line 334
    if-eqz v2, :cond_1c

    .line 335
    .line 336
    const/16 v30, 0x1

    .line 337
    .line 338
    goto :goto_14

    .line 339
    :cond_1c
    const/16 v30, 0x0

    .line 340
    .line 341
    goto :goto_14

    .line 342
    :cond_1d
    iget v2, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    .line 343
    .line 344
    move/from16 v30, v2

    .line 345
    .line 346
    :goto_14
    const v43, -0x3800061

    .line 347
    .line 348
    .line 349
    const/16 v44, 0x1f

    .line 350
    .line 351
    const/4 v7, 0x0

    .line 352
    const/4 v8, 0x0

    .line 353
    const/4 v9, 0x0

    .line 354
    const/4 v10, 0x0

    .line 355
    const/4 v11, 0x1

    .line 356
    const/4 v13, 0x0

    .line 357
    const/4 v14, 0x0

    .line 358
    const/4 v15, 0x0

    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    const/16 v17, 0x0

    .line 362
    .line 363
    const/16 v18, 0x0

    .line 364
    .line 365
    const/16 v19, 0x0

    .line 366
    .line 367
    const/16 v20, 0x0

    .line 368
    .line 369
    const/16 v21, 0x0

    .line 370
    .line 371
    const/16 v22, 0x0

    .line 372
    .line 373
    const/16 v23, 0x0

    .line 374
    .line 375
    const/16 v24, 0x0

    .line 376
    .line 377
    const/16 v25, 0x0

    .line 378
    .line 379
    const/16 v26, 0x0

    .line 380
    .line 381
    const/16 v27, 0x0

    .line 382
    .line 383
    const/16 v28, 0x0

    .line 384
    .line 385
    const/16 v31, 0x1

    .line 386
    .line 387
    const/16 v32, 0x0

    .line 388
    .line 389
    const/16 v33, 0x0

    .line 390
    .line 391
    const/16 v34, 0x0

    .line 392
    .line 393
    const/16 v35, 0x0

    .line 394
    .line 395
    const/16 v36, 0x0

    .line 396
    .line 397
    const/16 v37, 0x0

    .line 398
    .line 399
    const/16 v38, 0x0

    .line 400
    .line 401
    const/16 v39, 0x0

    .line 402
    .line 403
    const/16 v40, 0x0

    .line 404
    .line 405
    const/16 v41, 0x0

    .line 406
    .line 407
    const/16 v42, 0x0

    .line 408
    .line 409
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-eqz v1, :cond_17

    .line 418
    .line 419
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->e()V

    .line 420
    .line 421
    .line 422
    return-void

    .line 423
    :cond_1e
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/d0;->a:Lcom/zykj/mistake/feature/collection/detail/d0;

    .line 424
    .line 425
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-eqz v2, :cond_20

    .line 430
    .line 431
    :cond_1f
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    move-object v6, v1

    .line 436
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 437
    .line 438
    iget-object v2, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->b:Ljava/lang/String;

    .line 439
    .line 440
    const v43, 0x1fffffff

    .line 441
    .line 442
    .line 443
    const/16 v44, 0x1e

    .line 444
    .line 445
    const/4 v7, 0x0

    .line 446
    const/4 v8, 0x0

    .line 447
    const/4 v9, 0x0

    .line 448
    const/4 v10, 0x0

    .line 449
    const/4 v11, 0x0

    .line 450
    const/4 v12, 0x0

    .line 451
    const/4 v13, 0x0

    .line 452
    const/4 v14, 0x0

    .line 453
    const/4 v15, 0x0

    .line 454
    const/16 v16, 0x0

    .line 455
    .line 456
    const/16 v17, 0x0

    .line 457
    .line 458
    const/16 v18, 0x0

    .line 459
    .line 460
    const/16 v19, 0x0

    .line 461
    .line 462
    const/16 v20, 0x0

    .line 463
    .line 464
    const/16 v21, 0x0

    .line 465
    .line 466
    const/16 v22, 0x0

    .line 467
    .line 468
    const/16 v23, 0x0

    .line 469
    .line 470
    const/16 v24, 0x0

    .line 471
    .line 472
    const/16 v25, 0x0

    .line 473
    .line 474
    const/16 v26, 0x0

    .line 475
    .line 476
    const/16 v27, 0x0

    .line 477
    .line 478
    const/16 v28, 0x0

    .line 479
    .line 480
    const/16 v29, 0x0

    .line 481
    .line 482
    const/16 v30, 0x0

    .line 483
    .line 484
    const/16 v31, 0x0

    .line 485
    .line 486
    const/16 v32, 0x0

    .line 487
    .line 488
    const/16 v33, 0x0

    .line 489
    .line 490
    const/16 v34, 0x0

    .line 491
    .line 492
    const/16 v35, 0x1

    .line 493
    .line 494
    const-string v37, ""

    .line 495
    .line 496
    const/16 v38, 0x0

    .line 497
    .line 498
    const/16 v39, 0x0

    .line 499
    .line 500
    const/16 v40, 0x0

    .line 501
    .line 502
    const/16 v41, 0x0

    .line 503
    .line 504
    const/16 v42, 0x0

    .line 505
    .line 506
    move-object/from16 v36, v2

    .line 507
    .line 508
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    if-eqz v1, :cond_1f

    .line 517
    .line 518
    goto/16 :goto_16

    .line 519
    .line 520
    :cond_20
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/c0;->a:Lcom/zykj/mistake/feature/collection/detail/c0;

    .line 521
    .line 522
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    if-eqz v2, :cond_22

    .line 527
    .line 528
    :cond_21
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    move-object v6, v1

    .line 533
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 534
    .line 535
    const v43, 0x1fffffff

    .line 536
    .line 537
    .line 538
    const/16 v44, 0x1e

    .line 539
    .line 540
    const/4 v7, 0x0

    .line 541
    const/4 v8, 0x0

    .line 542
    const/4 v9, 0x0

    .line 543
    const/4 v10, 0x0

    .line 544
    const/4 v11, 0x0

    .line 545
    const/4 v12, 0x0

    .line 546
    const/4 v13, 0x0

    .line 547
    const/4 v14, 0x0

    .line 548
    const/4 v15, 0x0

    .line 549
    const/16 v16, 0x0

    .line 550
    .line 551
    const/16 v17, 0x0

    .line 552
    .line 553
    const/16 v18, 0x0

    .line 554
    .line 555
    const/16 v19, 0x0

    .line 556
    .line 557
    const/16 v20, 0x0

    .line 558
    .line 559
    const/16 v21, 0x0

    .line 560
    .line 561
    const/16 v22, 0x0

    .line 562
    .line 563
    const/16 v23, 0x0

    .line 564
    .line 565
    const/16 v24, 0x0

    .line 566
    .line 567
    const/16 v25, 0x0

    .line 568
    .line 569
    const/16 v26, 0x0

    .line 570
    .line 571
    const/16 v27, 0x0

    .line 572
    .line 573
    const/16 v28, 0x0

    .line 574
    .line 575
    const/16 v29, 0x0

    .line 576
    .line 577
    const/16 v30, 0x0

    .line 578
    .line 579
    const/16 v31, 0x0

    .line 580
    .line 581
    const/16 v32, 0x0

    .line 582
    .line 583
    const/16 v33, 0x0

    .line 584
    .line 585
    const/16 v34, 0x0

    .line 586
    .line 587
    const/16 v35, 0x0

    .line 588
    .line 589
    const-string v36, ""

    .line 590
    .line 591
    const-string v37, ""

    .line 592
    .line 593
    const/16 v38, 0x0

    .line 594
    .line 595
    const/16 v39, 0x0

    .line 596
    .line 597
    const/16 v40, 0x0

    .line 598
    .line 599
    const/16 v41, 0x0

    .line 600
    .line 601
    const/16 v42, 0x0

    .line 602
    .line 603
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v1

    .line 611
    if-eqz v1, :cond_21

    .line 612
    .line 613
    goto/16 :goto_16

    .line 614
    .line 615
    :cond_22
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/r;

    .line 616
    .line 617
    if-eqz v2, :cond_24

    .line 618
    .line 619
    :cond_23
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    move-object v6, v2

    .line 624
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 625
    .line 626
    move-object v3, v1

    .line 627
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/r;

    .line 628
    .line 629
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/collection/detail/r;->a()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    const/16 v4, 0x14

    .line 634
    .line 635
    invoke-static {v4, v3}, Lkotlin/text/p;->i0(ILjava/lang/String;)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v36

    .line 639
    const v43, 0x3fffffff    # 1.9999999f

    .line 640
    .line 641
    .line 642
    const/16 v44, 0x1f

    .line 643
    .line 644
    const/4 v7, 0x0

    .line 645
    const/4 v8, 0x0

    .line 646
    const/4 v9, 0x0

    .line 647
    const/4 v10, 0x0

    .line 648
    const/4 v11, 0x0

    .line 649
    const/4 v12, 0x0

    .line 650
    const/4 v13, 0x0

    .line 651
    const/4 v14, 0x0

    .line 652
    const/4 v15, 0x0

    .line 653
    const/16 v16, 0x0

    .line 654
    .line 655
    const/16 v17, 0x0

    .line 656
    .line 657
    const/16 v18, 0x0

    .line 658
    .line 659
    const/16 v19, 0x0

    .line 660
    .line 661
    const/16 v20, 0x0

    .line 662
    .line 663
    const/16 v21, 0x0

    .line 664
    .line 665
    const/16 v22, 0x0

    .line 666
    .line 667
    const/16 v23, 0x0

    .line 668
    .line 669
    const/16 v24, 0x0

    .line 670
    .line 671
    const/16 v25, 0x0

    .line 672
    .line 673
    const/16 v26, 0x0

    .line 674
    .line 675
    const/16 v27, 0x0

    .line 676
    .line 677
    const/16 v28, 0x0

    .line 678
    .line 679
    const/16 v29, 0x0

    .line 680
    .line 681
    const/16 v30, 0x0

    .line 682
    .line 683
    const/16 v31, 0x0

    .line 684
    .line 685
    const/16 v32, 0x0

    .line 686
    .line 687
    const/16 v33, 0x0

    .line 688
    .line 689
    const/16 v34, 0x0

    .line 690
    .line 691
    const/16 v35, 0x0

    .line 692
    .line 693
    const-string v37, ""

    .line 694
    .line 695
    const/16 v38, 0x0

    .line 696
    .line 697
    const/16 v39, 0x0

    .line 698
    .line 699
    const/16 v40, 0x0

    .line 700
    .line 701
    const/16 v41, 0x0

    .line 702
    .line 703
    const/16 v42, 0x0

    .line 704
    .line 705
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 706
    .line 707
    .line 708
    move-result-object v3

    .line 709
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v2

    .line 713
    if-eqz v2, :cond_23

    .line 714
    .line 715
    goto/16 :goto_16

    .line 716
    .line 717
    :cond_24
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/z;->a:Lcom/zykj/mistake/feature/collection/detail/z;

    .line 718
    .line 719
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v2

    .line 723
    if-eqz v2, :cond_25

    .line 724
    .line 725
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->b()V

    .line 726
    .line 727
    .line 728
    return-void

    .line 729
    :cond_25
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/e0;->a:Lcom/zykj/mistake/feature/collection/detail/e0;

    .line 730
    .line 731
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    if-eqz v2, :cond_27

    .line 736
    .line 737
    :cond_26
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    move-object v6, v1

    .line 742
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 743
    .line 744
    invoke-static {}, Lkotlin/collections/j0;->v()Lkotlin/collections/EmptySet;

    .line 745
    .line 746
    .line 747
    move-result-object v40

    .line 748
    const/16 v43, -0x1

    .line 749
    .line 750
    const/16 v44, 0x19

    .line 751
    .line 752
    const/4 v7, 0x0

    .line 753
    const/4 v8, 0x0

    .line 754
    const/4 v9, 0x0

    .line 755
    const/4 v10, 0x0

    .line 756
    const/4 v11, 0x0

    .line 757
    const/4 v12, 0x0

    .line 758
    const/4 v13, 0x0

    .line 759
    const/4 v14, 0x0

    .line 760
    const/4 v15, 0x0

    .line 761
    const/16 v16, 0x0

    .line 762
    .line 763
    const/16 v17, 0x0

    .line 764
    .line 765
    const/16 v18, 0x0

    .line 766
    .line 767
    const/16 v19, 0x0

    .line 768
    .line 769
    const/16 v20, 0x0

    .line 770
    .line 771
    const/16 v21, 0x0

    .line 772
    .line 773
    const/16 v22, 0x0

    .line 774
    .line 775
    const/16 v23, 0x0

    .line 776
    .line 777
    const/16 v24, 0x0

    .line 778
    .line 779
    const/16 v25, 0x0

    .line 780
    .line 781
    const/16 v26, 0x0

    .line 782
    .line 783
    const/16 v27, 0x0

    .line 784
    .line 785
    const/16 v28, 0x0

    .line 786
    .line 787
    const/16 v29, 0x0

    .line 788
    .line 789
    const/16 v30, 0x0

    .line 790
    .line 791
    const/16 v31, 0x0

    .line 792
    .line 793
    const/16 v32, 0x0

    .line 794
    .line 795
    const/16 v33, 0x0

    .line 796
    .line 797
    const/16 v34, 0x0

    .line 798
    .line 799
    const/16 v35, 0x0

    .line 800
    .line 801
    const/16 v36, 0x0

    .line 802
    .line 803
    const/16 v37, 0x0

    .line 804
    .line 805
    const/16 v38, 0x0

    .line 806
    .line 807
    const/16 v39, 0x1

    .line 808
    .line 809
    const/16 v41, 0x0

    .line 810
    .line 811
    const/16 v42, 0x0

    .line 812
    .line 813
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    move-result v1

    .line 821
    if-eqz v1, :cond_26

    .line 822
    .line 823
    goto/16 :goto_16

    .line 824
    .line 825
    :cond_27
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/q;->a:Lcom/zykj/mistake/feature/collection/detail/q;

    .line 826
    .line 827
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    move-result v2

    .line 831
    if-eqz v2, :cond_29

    .line 832
    .line 833
    :cond_28
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v1

    .line 837
    move-object v6, v1

    .line 838
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 839
    .line 840
    invoke-static {}, Lkotlin/collections/j0;->v()Lkotlin/collections/EmptySet;

    .line 841
    .line 842
    .line 843
    move-result-object v40

    .line 844
    const/16 v43, -0x1

    .line 845
    .line 846
    const/16 v44, 0x1

    .line 847
    .line 848
    const/4 v7, 0x0

    .line 849
    const/4 v8, 0x0

    .line 850
    const/4 v9, 0x0

    .line 851
    const/4 v10, 0x0

    .line 852
    const/4 v11, 0x0

    .line 853
    const/4 v12, 0x0

    .line 854
    const/4 v13, 0x0

    .line 855
    const/4 v14, 0x0

    .line 856
    const/4 v15, 0x0

    .line 857
    const/16 v16, 0x0

    .line 858
    .line 859
    const/16 v17, 0x0

    .line 860
    .line 861
    const/16 v18, 0x0

    .line 862
    .line 863
    const/16 v19, 0x0

    .line 864
    .line 865
    const/16 v20, 0x0

    .line 866
    .line 867
    const/16 v21, 0x0

    .line 868
    .line 869
    const/16 v22, 0x0

    .line 870
    .line 871
    const/16 v23, 0x0

    .line 872
    .line 873
    const/16 v24, 0x0

    .line 874
    .line 875
    const/16 v25, 0x0

    .line 876
    .line 877
    const/16 v26, 0x0

    .line 878
    .line 879
    const/16 v27, 0x0

    .line 880
    .line 881
    const/16 v28, 0x0

    .line 882
    .line 883
    const/16 v29, 0x0

    .line 884
    .line 885
    const/16 v30, 0x0

    .line 886
    .line 887
    const/16 v31, 0x0

    .line 888
    .line 889
    const/16 v32, 0x0

    .line 890
    .line 891
    const/16 v33, 0x0

    .line 892
    .line 893
    const/16 v34, 0x0

    .line 894
    .line 895
    const/16 v35, 0x0

    .line 896
    .line 897
    const/16 v36, 0x0

    .line 898
    .line 899
    const/16 v37, 0x0

    .line 900
    .line 901
    const/16 v38, 0x0

    .line 902
    .line 903
    const/16 v39, 0x0

    .line 904
    .line 905
    const/16 v41, 0x0

    .line 906
    .line 907
    const/16 v42, 0x0

    .line 908
    .line 909
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    if-eqz v1, :cond_28

    .line 918
    .line 919
    goto/16 :goto_16

    .line 920
    .line 921
    :cond_29
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/v0;

    .line 922
    .line 923
    if-eqz v2, :cond_2d

    .line 924
    .line 925
    :cond_2a
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    move-object v6, v2

    .line 930
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 931
    .line 932
    invoke-virtual {v6}, Lcom/zykj/mistake/feature/collection/detail/z0;->j()Z

    .line 933
    .line 934
    .line 935
    move-result v3

    .line 936
    if-nez v3, :cond_2b

    .line 937
    .line 938
    goto :goto_15

    .line 939
    :cond_2b
    iget-object v3, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    .line 940
    .line 941
    check-cast v3, Ljava/lang/Iterable;

    .line 942
    .line 943
    invoke-static {v3}, Lkotlin/collections/t;->G0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 944
    .line 945
    .line 946
    move-result-object v3

    .line 947
    move-object v4, v1

    .line 948
    check-cast v4, Lcom/zykj/mistake/feature/collection/detail/v0;

    .line 949
    .line 950
    iget-object v4, v4, Lcom/zykj/mistake/feature/collection/detail/v0;->a:Ljava/lang/String;

    .line 951
    .line 952
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 953
    .line 954
    .line 955
    move-result v7

    .line 956
    if-nez v7, :cond_2c

    .line 957
    .line 958
    invoke-interface {v3, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 959
    .line 960
    .line 961
    :cond_2c
    const/16 v43, -0x1

    .line 962
    .line 963
    const/16 v44, 0x1b

    .line 964
    .line 965
    const/4 v7, 0x0

    .line 966
    const/4 v8, 0x0

    .line 967
    const/4 v9, 0x0

    .line 968
    const/4 v10, 0x0

    .line 969
    const/4 v11, 0x0

    .line 970
    const/4 v12, 0x0

    .line 971
    const/4 v13, 0x0

    .line 972
    const/4 v14, 0x0

    .line 973
    const/4 v15, 0x0

    .line 974
    const/16 v16, 0x0

    .line 975
    .line 976
    const/16 v17, 0x0

    .line 977
    .line 978
    const/16 v18, 0x0

    .line 979
    .line 980
    const/16 v19, 0x0

    .line 981
    .line 982
    const/16 v20, 0x0

    .line 983
    .line 984
    const/16 v21, 0x0

    .line 985
    .line 986
    const/16 v22, 0x0

    .line 987
    .line 988
    const/16 v23, 0x0

    .line 989
    .line 990
    const/16 v24, 0x0

    .line 991
    .line 992
    const/16 v25, 0x0

    .line 993
    .line 994
    const/16 v26, 0x0

    .line 995
    .line 996
    const/16 v27, 0x0

    .line 997
    .line 998
    const/16 v28, 0x0

    .line 999
    .line 1000
    const/16 v29, 0x0

    .line 1001
    .line 1002
    const/16 v30, 0x0

    .line 1003
    .line 1004
    const/16 v31, 0x0

    .line 1005
    .line 1006
    const/16 v32, 0x0

    .line 1007
    .line 1008
    const/16 v33, 0x0

    .line 1009
    .line 1010
    const/16 v34, 0x0

    .line 1011
    .line 1012
    const/16 v35, 0x0

    .line 1013
    .line 1014
    const/16 v36, 0x0

    .line 1015
    .line 1016
    const/16 v37, 0x0

    .line 1017
    .line 1018
    const/16 v38, 0x0

    .line 1019
    .line 1020
    const/16 v39, 0x0

    .line 1021
    .line 1022
    const/16 v41, 0x0

    .line 1023
    .line 1024
    const/16 v42, 0x0

    .line 1025
    .line 1026
    move-object/from16 v40, v3

    .line 1027
    .line 1028
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v6

    .line 1032
    :goto_15
    invoke-virtual {v5, v2, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v2

    .line 1036
    if-eqz v2, :cond_2a

    .line 1037
    .line 1038
    goto/16 :goto_16

    .line 1039
    .line 1040
    :cond_2d
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/y;->a:Lcom/zykj/mistake/feature/collection/detail/y;

    .line 1041
    .line 1042
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    if-eqz v2, :cond_2f

    .line 1047
    .line 1048
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v1

    .line 1052
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1053
    .line 1054
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    .line 1055
    .line 1056
    check-cast v1, Ljava/util/Collection;

    .line 1057
    .line 1058
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1059
    .line 1060
    .line 1061
    move-result v1

    .line 1062
    if-nez v1, :cond_5d

    .line 1063
    .line 1064
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1069
    .line 1070
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/collection/detail/z0;->k()Z

    .line 1071
    .line 1072
    .line 1073
    move-result v1

    .line 1074
    if-nez v1, :cond_5d

    .line 1075
    .line 1076
    :cond_2e
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v1

    .line 1080
    move-object v6, v1

    .line 1081
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1082
    .line 1083
    const/16 v43, -0x1

    .line 1084
    .line 1085
    const/16 v44, 0xf

    .line 1086
    .line 1087
    const/4 v7, 0x0

    .line 1088
    const/4 v8, 0x0

    .line 1089
    const/4 v9, 0x0

    .line 1090
    const/4 v10, 0x0

    .line 1091
    const/4 v11, 0x0

    .line 1092
    const/4 v12, 0x0

    .line 1093
    const/4 v13, 0x0

    .line 1094
    const/4 v14, 0x0

    .line 1095
    const/4 v15, 0x0

    .line 1096
    const/16 v16, 0x0

    .line 1097
    .line 1098
    const/16 v17, 0x0

    .line 1099
    .line 1100
    const/16 v18, 0x0

    .line 1101
    .line 1102
    const/16 v19, 0x0

    .line 1103
    .line 1104
    const/16 v20, 0x0

    .line 1105
    .line 1106
    const/16 v21, 0x0

    .line 1107
    .line 1108
    const/16 v22, 0x0

    .line 1109
    .line 1110
    const/16 v23, 0x0

    .line 1111
    .line 1112
    const/16 v24, 0x0

    .line 1113
    .line 1114
    const/16 v25, 0x0

    .line 1115
    .line 1116
    const/16 v26, 0x0

    .line 1117
    .line 1118
    const/16 v27, 0x0

    .line 1119
    .line 1120
    const/16 v28, 0x0

    .line 1121
    .line 1122
    const/16 v29, 0x0

    .line 1123
    .line 1124
    const/16 v30, 0x0

    .line 1125
    .line 1126
    const/16 v31, 0x0

    .line 1127
    .line 1128
    const/16 v32, 0x0

    .line 1129
    .line 1130
    const/16 v33, 0x0

    .line 1131
    .line 1132
    const/16 v34, 0x0

    .line 1133
    .line 1134
    const/16 v35, 0x0

    .line 1135
    .line 1136
    const/16 v36, 0x0

    .line 1137
    .line 1138
    const/16 v37, 0x0

    .line 1139
    .line 1140
    const/16 v38, 0x0

    .line 1141
    .line 1142
    const/16 v39, 0x0

    .line 1143
    .line 1144
    const/16 v40, 0x0

    .line 1145
    .line 1146
    const/16 v41, 0x0

    .line 1147
    .line 1148
    const/16 v42, 0x1

    .line 1149
    .line 1150
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v2

    .line 1154
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v1

    .line 1158
    if-eqz v1, :cond_2e

    .line 1159
    .line 1160
    goto/16 :goto_16

    .line 1161
    .line 1162
    :cond_2f
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/b0;->a:Lcom/zykj/mistake/feature/collection/detail/b0;

    .line 1163
    .line 1164
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1165
    .line 1166
    .line 1167
    move-result v2

    .line 1168
    if-eqz v2, :cond_31

    .line 1169
    .line 1170
    :cond_30
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v1

    .line 1174
    move-object v6, v1

    .line 1175
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1176
    .line 1177
    const/16 v43, -0x1

    .line 1178
    .line 1179
    const/16 v44, 0xf

    .line 1180
    .line 1181
    const/4 v7, 0x0

    .line 1182
    const/4 v8, 0x0

    .line 1183
    const/4 v9, 0x0

    .line 1184
    const/4 v10, 0x0

    .line 1185
    const/4 v11, 0x0

    .line 1186
    const/4 v12, 0x0

    .line 1187
    const/4 v13, 0x0

    .line 1188
    const/4 v14, 0x0

    .line 1189
    const/4 v15, 0x0

    .line 1190
    const/16 v16, 0x0

    .line 1191
    .line 1192
    const/16 v17, 0x0

    .line 1193
    .line 1194
    const/16 v18, 0x0

    .line 1195
    .line 1196
    const/16 v19, 0x0

    .line 1197
    .line 1198
    const/16 v20, 0x0

    .line 1199
    .line 1200
    const/16 v21, 0x0

    .line 1201
    .line 1202
    const/16 v22, 0x0

    .line 1203
    .line 1204
    const/16 v23, 0x0

    .line 1205
    .line 1206
    const/16 v24, 0x0

    .line 1207
    .line 1208
    const/16 v25, 0x0

    .line 1209
    .line 1210
    const/16 v26, 0x0

    .line 1211
    .line 1212
    const/16 v27, 0x0

    .line 1213
    .line 1214
    const/16 v28, 0x0

    .line 1215
    .line 1216
    const/16 v29, 0x0

    .line 1217
    .line 1218
    const/16 v30, 0x0

    .line 1219
    .line 1220
    const/16 v31, 0x0

    .line 1221
    .line 1222
    const/16 v32, 0x0

    .line 1223
    .line 1224
    const/16 v33, 0x0

    .line 1225
    .line 1226
    const/16 v34, 0x0

    .line 1227
    .line 1228
    const/16 v35, 0x0

    .line 1229
    .line 1230
    const/16 v36, 0x0

    .line 1231
    .line 1232
    const/16 v37, 0x0

    .line 1233
    .line 1234
    const/16 v38, 0x0

    .line 1235
    .line 1236
    const/16 v39, 0x0

    .line 1237
    .line 1238
    const/16 v40, 0x0

    .line 1239
    .line 1240
    const/16 v41, 0x0

    .line 1241
    .line 1242
    const/16 v42, 0x0

    .line 1243
    .line 1244
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v2

    .line 1248
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v1

    .line 1252
    if-eqz v1, :cond_30

    .line 1253
    .line 1254
    goto/16 :goto_16

    .line 1255
    .line 1256
    :cond_31
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/x;->a:Lcom/zykj/mistake/feature/collection/detail/x;

    .line 1257
    .line 1258
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v2

    .line 1262
    if-eqz v2, :cond_32

    .line 1263
    .line 1264
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->a()V

    .line 1265
    .line 1266
    .line 1267
    return-void

    .line 1268
    :cond_32
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/j0;

    .line 1269
    .line 1270
    if-eqz v2, :cond_33

    .line 1271
    .line 1272
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/j0;

    .line 1273
    .line 1274
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/collection/detail/j0;->a()Ljava/util/Set;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v1

    .line 1278
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->g(Ljava/util/Set;)V

    .line 1279
    .line 1280
    .line 1281
    return-void

    .line 1282
    :cond_33
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/u0;->a:Lcom/zykj/mistake/feature/collection/detail/u0;

    .line 1283
    .line 1284
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v2

    .line 1288
    const-string v4, "SP_CONTACT_MODE"

    .line 1289
    .line 1290
    if-eqz v2, :cond_35

    .line 1291
    .line 1292
    invoke-virtual {v0}, Landroidx/lifecycle/AndroidViewModel;->getApplication()Landroid/app/Application;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v1

    .line 1296
    const/4 v2, 0x0

    .line 1297
    invoke-static {v1, v4, v2}, Lcom/zykj/mistake/utils/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 1298
    .line 1299
    .line 1300
    move-result v1

    .line 1301
    const/16 v46, 0x1

    .line 1302
    .line 1303
    xor-int/lit8 v14, v1, 0x1

    .line 1304
    .line 1305
    invoke-virtual {v0}, Landroidx/lifecycle/AndroidViewModel;->getApplication()Landroid/app/Application;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v1

    .line 1309
    invoke-static {v1, v4, v14}, Lcom/zykj/mistake/utils/d;->e(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 1310
    .line 1311
    .line 1312
    invoke-static {v14}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v1

    .line 1316
    const/4 v2, 0x4

    .line 1317
    const-string v3, "MistakeListPracticeMode"

    .line 1318
    .line 1319
    invoke-static {v2, v3, v1}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 1320
    .line 1321
    .line 1322
    :cond_34
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v1

    .line 1326
    move-object v6, v1

    .line 1327
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1328
    .line 1329
    const/16 v43, -0x101

    .line 1330
    .line 1331
    const/16 v44, 0x1f

    .line 1332
    .line 1333
    const/4 v7, 0x0

    .line 1334
    const/4 v8, 0x0

    .line 1335
    const/4 v9, 0x0

    .line 1336
    const/4 v10, 0x0

    .line 1337
    const/4 v11, 0x0

    .line 1338
    const/4 v12, 0x0

    .line 1339
    const/4 v13, 0x0

    .line 1340
    const/4 v15, 0x0

    .line 1341
    const/16 v16, 0x0

    .line 1342
    .line 1343
    const/16 v17, 0x0

    .line 1344
    .line 1345
    const/16 v18, 0x0

    .line 1346
    .line 1347
    const/16 v19, 0x0

    .line 1348
    .line 1349
    const/16 v20, 0x0

    .line 1350
    .line 1351
    const/16 v21, 0x0

    .line 1352
    .line 1353
    const/16 v22, 0x0

    .line 1354
    .line 1355
    const/16 v23, 0x0

    .line 1356
    .line 1357
    const/16 v24, 0x0

    .line 1358
    .line 1359
    const/16 v25, 0x0

    .line 1360
    .line 1361
    const/16 v26, 0x0

    .line 1362
    .line 1363
    const/16 v27, 0x0

    .line 1364
    .line 1365
    const/16 v28, 0x0

    .line 1366
    .line 1367
    const/16 v29, 0x0

    .line 1368
    .line 1369
    const/16 v30, 0x0

    .line 1370
    .line 1371
    const/16 v31, 0x0

    .line 1372
    .line 1373
    const/16 v32, 0x0

    .line 1374
    .line 1375
    const/16 v33, 0x0

    .line 1376
    .line 1377
    const/16 v34, 0x0

    .line 1378
    .line 1379
    const/16 v35, 0x0

    .line 1380
    .line 1381
    const/16 v36, 0x0

    .line 1382
    .line 1383
    const/16 v37, 0x0

    .line 1384
    .line 1385
    const/16 v38, 0x0

    .line 1386
    .line 1387
    const/16 v39, 0x0

    .line 1388
    .line 1389
    const/16 v40, 0x0

    .line 1390
    .line 1391
    const/16 v41, 0x0

    .line 1392
    .line 1393
    const/16 v42, 0x0

    .line 1394
    .line 1395
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v2

    .line 1399
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1400
    .line 1401
    .line 1402
    move-result v1

    .line 1403
    if-eqz v1, :cond_34

    .line 1404
    .line 1405
    goto/16 :goto_16

    .line 1406
    .line 1407
    :cond_35
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/t0;->a:Lcom/zykj/mistake/feature/collection/detail/t0;

    .line 1408
    .line 1409
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v2

    .line 1413
    if-eqz v2, :cond_37

    .line 1414
    .line 1415
    :cond_36
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v1

    .line 1419
    move-object v6, v1

    .line 1420
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1421
    .line 1422
    invoke-virtual {v0}, Landroidx/lifecycle/AndroidViewModel;->getApplication()Landroid/app/Application;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v2

    .line 1426
    const/4 v3, 0x0

    .line 1427
    invoke-static {v2, v4, v3}, Lcom/zykj/mistake/utils/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 1428
    .line 1429
    .line 1430
    move-result v14

    .line 1431
    const/16 v43, -0x101

    .line 1432
    .line 1433
    const/16 v44, 0x1f

    .line 1434
    .line 1435
    const/4 v7, 0x0

    .line 1436
    const/4 v8, 0x0

    .line 1437
    const/4 v9, 0x0

    .line 1438
    const/4 v10, 0x0

    .line 1439
    const/4 v11, 0x0

    .line 1440
    const/4 v12, 0x0

    .line 1441
    const/4 v13, 0x0

    .line 1442
    const/4 v15, 0x0

    .line 1443
    const/16 v16, 0x0

    .line 1444
    .line 1445
    const/16 v17, 0x0

    .line 1446
    .line 1447
    const/16 v18, 0x0

    .line 1448
    .line 1449
    const/16 v19, 0x0

    .line 1450
    .line 1451
    const/16 v20, 0x0

    .line 1452
    .line 1453
    const/16 v21, 0x0

    .line 1454
    .line 1455
    const/16 v22, 0x0

    .line 1456
    .line 1457
    const/16 v23, 0x0

    .line 1458
    .line 1459
    const/16 v24, 0x0

    .line 1460
    .line 1461
    const/16 v25, 0x0

    .line 1462
    .line 1463
    const/16 v26, 0x0

    .line 1464
    .line 1465
    const/16 v27, 0x0

    .line 1466
    .line 1467
    const/16 v28, 0x0

    .line 1468
    .line 1469
    const/16 v29, 0x0

    .line 1470
    .line 1471
    const/16 v30, 0x0

    .line 1472
    .line 1473
    const/16 v31, 0x0

    .line 1474
    .line 1475
    const/16 v32, 0x0

    .line 1476
    .line 1477
    const/16 v33, 0x0

    .line 1478
    .line 1479
    const/16 v34, 0x0

    .line 1480
    .line 1481
    const/16 v35, 0x0

    .line 1482
    .line 1483
    const/16 v36, 0x0

    .line 1484
    .line 1485
    const/16 v37, 0x0

    .line 1486
    .line 1487
    const/16 v38, 0x0

    .line 1488
    .line 1489
    const/16 v39, 0x0

    .line 1490
    .line 1491
    const/16 v40, 0x0

    .line 1492
    .line 1493
    const/16 v41, 0x0

    .line 1494
    .line 1495
    const/16 v42, 0x0

    .line 1496
    .line 1497
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v2

    .line 1501
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1502
    .line 1503
    .line 1504
    move-result v1

    .line 1505
    if-eqz v1, :cond_36

    .line 1506
    .line 1507
    goto/16 :goto_16

    .line 1508
    .line 1509
    :cond_37
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/l0;->a:Lcom/zykj/mistake/feature/collection/detail/l0;

    .line 1510
    .line 1511
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1512
    .line 1513
    .line 1514
    move-result v2

    .line 1515
    if-eqz v2, :cond_38

    .line 1516
    .line 1517
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->i()V

    .line 1518
    .line 1519
    .line 1520
    return-void

    .line 1521
    :cond_38
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/a0;->a:Lcom/zykj/mistake/feature/collection/detail/a0;

    .line 1522
    .line 1523
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1524
    .line 1525
    .line 1526
    move-result v2

    .line 1527
    if-eqz v2, :cond_39

    .line 1528
    .line 1529
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c()V

    .line 1530
    .line 1531
    .line 1532
    return-void

    .line 1533
    :cond_39
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/v;->a:Lcom/zykj/mistake/feature/collection/detail/v;

    .line 1534
    .line 1535
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1536
    .line 1537
    .line 1538
    move-result v2

    .line 1539
    if-eqz v2, :cond_3b

    .line 1540
    .line 1541
    :cond_3a
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v1

    .line 1545
    move-object v6, v1

    .line 1546
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1547
    .line 1548
    const/16 v43, -0x21

    .line 1549
    .line 1550
    const/16 v44, 0x1f

    .line 1551
    .line 1552
    const/4 v7, 0x0

    .line 1553
    const/4 v8, 0x0

    .line 1554
    const/4 v9, 0x0

    .line 1555
    const/4 v10, 0x0

    .line 1556
    const/4 v11, 0x0

    .line 1557
    const/4 v12, 0x0

    .line 1558
    const/4 v13, 0x0

    .line 1559
    const/4 v14, 0x0

    .line 1560
    const/4 v15, 0x0

    .line 1561
    const/16 v16, 0x0

    .line 1562
    .line 1563
    const/16 v17, 0x0

    .line 1564
    .line 1565
    const/16 v18, 0x0

    .line 1566
    .line 1567
    const/16 v19, 0x0

    .line 1568
    .line 1569
    const/16 v20, 0x0

    .line 1570
    .line 1571
    const/16 v21, 0x0

    .line 1572
    .line 1573
    const/16 v22, 0x0

    .line 1574
    .line 1575
    const/16 v23, 0x0

    .line 1576
    .line 1577
    const/16 v24, 0x0

    .line 1578
    .line 1579
    const/16 v25, 0x0

    .line 1580
    .line 1581
    const/16 v26, 0x0

    .line 1582
    .line 1583
    const/16 v27, 0x0

    .line 1584
    .line 1585
    const/16 v28, 0x0

    .line 1586
    .line 1587
    const/16 v29, 0x0

    .line 1588
    .line 1589
    const/16 v30, 0x0

    .line 1590
    .line 1591
    const/16 v31, 0x0

    .line 1592
    .line 1593
    const/16 v32, 0x0

    .line 1594
    .line 1595
    const/16 v33, 0x0

    .line 1596
    .line 1597
    const/16 v34, 0x0

    .line 1598
    .line 1599
    const/16 v35, 0x0

    .line 1600
    .line 1601
    const/16 v36, 0x0

    .line 1602
    .line 1603
    const/16 v37, 0x0

    .line 1604
    .line 1605
    const/16 v38, 0x0

    .line 1606
    .line 1607
    const/16 v39, 0x0

    .line 1608
    .line 1609
    const/16 v40, 0x0

    .line 1610
    .line 1611
    const/16 v41, 0x0

    .line 1612
    .line 1613
    const/16 v42, 0x0

    .line 1614
    .line 1615
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v2

    .line 1619
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1620
    .line 1621
    .line 1622
    move-result v1

    .line 1623
    if-eqz v1, :cond_3a

    .line 1624
    .line 1625
    goto/16 :goto_16

    .line 1626
    .line 1627
    :cond_3b
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/w;

    .line 1628
    .line 1629
    if-eqz v2, :cond_3d

    .line 1630
    .line 1631
    :cond_3c
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v2

    .line 1635
    move-object v6, v2

    .line 1636
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1637
    .line 1638
    move-object v3, v1

    .line 1639
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/w;

    .line 1640
    .line 1641
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/collection/detail/w;->b()Ljava/lang/String;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v22

    .line 1645
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/collection/detail/w;->a()Ljava/lang/String;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v23

    .line 1649
    const v43, -0x78001

    .line 1650
    .line 1651
    .line 1652
    const/16 v44, 0x1f

    .line 1653
    .line 1654
    const/4 v7, 0x0

    .line 1655
    const/4 v8, 0x0

    .line 1656
    const/4 v9, 0x0

    .line 1657
    const/4 v10, 0x0

    .line 1658
    const/4 v11, 0x0

    .line 1659
    const/4 v12, 0x0

    .line 1660
    const/4 v13, 0x0

    .line 1661
    const/4 v14, 0x0

    .line 1662
    const/4 v15, 0x0

    .line 1663
    const/16 v16, 0x0

    .line 1664
    .line 1665
    const/16 v17, 0x0

    .line 1666
    .line 1667
    const/16 v18, 0x0

    .line 1668
    .line 1669
    const/16 v19, 0x0

    .line 1670
    .line 1671
    const/16 v20, 0x0

    .line 1672
    .line 1673
    const/16 v21, 0x3

    .line 1674
    .line 1675
    const/16 v24, 0x1

    .line 1676
    .line 1677
    const/16 v25, 0x0

    .line 1678
    .line 1679
    const/16 v26, 0x0

    .line 1680
    .line 1681
    const/16 v27, 0x0

    .line 1682
    .line 1683
    const/16 v28, 0x0

    .line 1684
    .line 1685
    const/16 v29, 0x0

    .line 1686
    .line 1687
    const/16 v30, 0x0

    .line 1688
    .line 1689
    const/16 v31, 0x0

    .line 1690
    .line 1691
    const/16 v32, 0x0

    .line 1692
    .line 1693
    const/16 v33, 0x0

    .line 1694
    .line 1695
    const/16 v34, 0x0

    .line 1696
    .line 1697
    const/16 v35, 0x0

    .line 1698
    .line 1699
    const/16 v36, 0x0

    .line 1700
    .line 1701
    const/16 v37, 0x0

    .line 1702
    .line 1703
    const/16 v38, 0x0

    .line 1704
    .line 1705
    const/16 v39, 0x0

    .line 1706
    .line 1707
    const/16 v40, 0x0

    .line 1708
    .line 1709
    const/16 v41, 0x0

    .line 1710
    .line 1711
    const/16 v42, 0x0

    .line 1712
    .line 1713
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v3

    .line 1717
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1718
    .line 1719
    .line 1720
    move-result v2

    .line 1721
    if-eqz v2, :cond_3c

    .line 1722
    .line 1723
    goto/16 :goto_16

    .line 1724
    .line 1725
    :cond_3d
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/k0;->a:Lcom/zykj/mistake/feature/collection/detail/k0;

    .line 1726
    .line 1727
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1728
    .line 1729
    .line 1730
    move-result v2

    .line 1731
    if-eqz v2, :cond_3f

    .line 1732
    .line 1733
    :cond_3e
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v1

    .line 1737
    move-object v6, v1

    .line 1738
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1739
    .line 1740
    const v43, -0x78001

    .line 1741
    .line 1742
    .line 1743
    const/16 v44, 0x1f

    .line 1744
    .line 1745
    const/4 v7, 0x0

    .line 1746
    const/4 v8, 0x0

    .line 1747
    const/4 v9, 0x0

    .line 1748
    const/4 v10, 0x0

    .line 1749
    const/4 v11, 0x0

    .line 1750
    const/4 v12, 0x0

    .line 1751
    const/4 v13, 0x0

    .line 1752
    const/4 v14, 0x0

    .line 1753
    const/4 v15, 0x0

    .line 1754
    const/16 v16, 0x0

    .line 1755
    .line 1756
    const/16 v17, 0x0

    .line 1757
    .line 1758
    const/16 v18, 0x0

    .line 1759
    .line 1760
    const/16 v19, 0x0

    .line 1761
    .line 1762
    const/16 v20, 0x0

    .line 1763
    .line 1764
    const/16 v21, 0x1

    .line 1765
    .line 1766
    const/16 v22, 0x0

    .line 1767
    .line 1768
    const/16 v23, 0x0

    .line 1769
    .line 1770
    const/16 v24, 0x0

    .line 1771
    .line 1772
    const/16 v25, 0x0

    .line 1773
    .line 1774
    const/16 v26, 0x0

    .line 1775
    .line 1776
    const/16 v27, 0x0

    .line 1777
    .line 1778
    const/16 v28, 0x0

    .line 1779
    .line 1780
    const/16 v29, 0x0

    .line 1781
    .line 1782
    const/16 v30, 0x0

    .line 1783
    .line 1784
    const/16 v31, 0x0

    .line 1785
    .line 1786
    const/16 v32, 0x0

    .line 1787
    .line 1788
    const/16 v33, 0x0

    .line 1789
    .line 1790
    const/16 v34, 0x0

    .line 1791
    .line 1792
    const/16 v35, 0x0

    .line 1793
    .line 1794
    const/16 v36, 0x0

    .line 1795
    .line 1796
    const/16 v37, 0x0

    .line 1797
    .line 1798
    const/16 v38, 0x0

    .line 1799
    .line 1800
    const/16 v39, 0x0

    .line 1801
    .line 1802
    const/16 v40, 0x0

    .line 1803
    .line 1804
    const/16 v41, 0x0

    .line 1805
    .line 1806
    const/16 v42, 0x0

    .line 1807
    .line 1808
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v2

    .line 1812
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1813
    .line 1814
    .line 1815
    move-result v1

    .line 1816
    if-eqz v1, :cond_3e

    .line 1817
    .line 1818
    goto/16 :goto_16

    .line 1819
    .line 1820
    :cond_3f
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/h0;->a:Lcom/zykj/mistake/feature/collection/detail/h0;

    .line 1821
    .line 1822
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1823
    .line 1824
    .line 1825
    move-result v2

    .line 1826
    if-eqz v2, :cond_40

    .line 1827
    .line 1828
    const/4 v2, 0x1

    .line 1829
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->h(Z)V

    .line 1830
    .line 1831
    .line 1832
    return-void

    .line 1833
    :cond_40
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/i0;

    .line 1834
    .line 1835
    if-eqz v2, :cond_42

    .line 1836
    .line 1837
    :cond_41
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v2

    .line 1841
    move-object v6, v2

    .line 1842
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1843
    .line 1844
    sget-object v10, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->EXISTING:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 1845
    .line 1846
    sget-object v12, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->ADD_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 1847
    .line 1848
    iget v3, v6, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    .line 1849
    .line 1850
    move-object v4, v1

    .line 1851
    check-cast v4, Lcom/zykj/mistake/feature/collection/detail/i0;

    .line 1852
    .line 1853
    invoke-virtual {v4}, Lcom/zykj/mistake/feature/collection/detail/i0;->a()I

    .line 1854
    .line 1855
    .line 1856
    move-result v4

    .line 1857
    add-int/2addr v4, v3

    .line 1858
    const/16 v3, 0x64

    .line 1859
    .line 1860
    invoke-static {v4, v3}, Lkotlin/collections/u;->j(II)I

    .line 1861
    .line 1862
    .line 1863
    move-result v9

    .line 1864
    invoke-static {}, Lkotlin/collections/j0;->v()Lkotlin/collections/EmptySet;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v40

    .line 1868
    const/16 v43, -0x75

    .line 1869
    .line 1870
    const/16 v44, 0x19

    .line 1871
    .line 1872
    const/4 v7, 0x0

    .line 1873
    const/4 v8, 0x0

    .line 1874
    const/4 v11, 0x0

    .line 1875
    const/4 v13, 0x0

    .line 1876
    const/4 v14, 0x0

    .line 1877
    const/4 v15, 0x0

    .line 1878
    const/16 v16, 0x0

    .line 1879
    .line 1880
    const/16 v17, 0x0

    .line 1881
    .line 1882
    const/16 v18, 0x0

    .line 1883
    .line 1884
    const/16 v19, 0x0

    .line 1885
    .line 1886
    const/16 v20, 0x0

    .line 1887
    .line 1888
    const/16 v21, 0x0

    .line 1889
    .line 1890
    const/16 v22, 0x0

    .line 1891
    .line 1892
    const/16 v23, 0x0

    .line 1893
    .line 1894
    const/16 v24, 0x0

    .line 1895
    .line 1896
    const/16 v25, 0x0

    .line 1897
    .line 1898
    const/16 v26, 0x0

    .line 1899
    .line 1900
    const/16 v27, 0x0

    .line 1901
    .line 1902
    const/16 v28, 0x0

    .line 1903
    .line 1904
    const/16 v29, 0x0

    .line 1905
    .line 1906
    const/16 v30, 0x0

    .line 1907
    .line 1908
    const/16 v31, 0x0

    .line 1909
    .line 1910
    const/16 v32, 0x0

    .line 1911
    .line 1912
    const/16 v33, 0x0

    .line 1913
    .line 1914
    const/16 v34, 0x0

    .line 1915
    .line 1916
    const/16 v35, 0x0

    .line 1917
    .line 1918
    const/16 v36, 0x0

    .line 1919
    .line 1920
    const/16 v37, 0x0

    .line 1921
    .line 1922
    const/16 v38, 0x0

    .line 1923
    .line 1924
    const/16 v39, 0x0

    .line 1925
    .line 1926
    const/16 v41, 0x0

    .line 1927
    .line 1928
    const/16 v42, 0x0

    .line 1929
    .line 1930
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v3

    .line 1934
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1935
    .line 1936
    .line 1937
    move-result v2

    .line 1938
    if-eqz v2, :cond_41

    .line 1939
    .line 1940
    const/4 v2, 0x1

    .line 1941
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->h(Z)V

    .line 1942
    .line 1943
    .line 1944
    return-void

    .line 1945
    :cond_42
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/g0;->a:Lcom/zykj/mistake/feature/collection/detail/g0;

    .line 1946
    .line 1947
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1948
    .line 1949
    .line 1950
    move-result v2

    .line 1951
    if-eqz v2, :cond_44

    .line 1952
    .line 1953
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v1

    .line 1957
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1958
    .line 1959
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/collection/detail/z0;->e()Z

    .line 1960
    .line 1961
    .line 1962
    move-result v2

    .line 1963
    if-eqz v2, :cond_5d

    .line 1964
    .line 1965
    iget-boolean v2, v1, Lcom/zykj/mistake/feature/collection/detail/z0;->j:Z

    .line 1966
    .line 1967
    if-nez v2, :cond_5d

    .line 1968
    .line 1969
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/collection/detail/z0;->l()Z

    .line 1970
    .line 1971
    .line 1972
    move-result v1

    .line 1973
    if-eqz v1, :cond_43

    .line 1974
    .line 1975
    goto/16 :goto_16

    .line 1976
    .line 1977
    :cond_43
    const/4 v2, 0x0

    .line 1978
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->h(Z)V

    .line 1979
    .line 1980
    .line 1981
    return-void

    .line 1982
    :cond_44
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/u;

    .line 1983
    .line 1984
    if-eqz v2, :cond_45

    .line 1985
    .line 1986
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/u;

    .line 1987
    .line 1988
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/collection/detail/u;->a()Ljava/lang/String;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v1

    .line 1992
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->f(Ljava/lang/String;)V

    .line 1993
    .line 1994
    .line 1995
    return-void

    .line 1996
    :cond_45
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/s0;

    .line 1997
    .line 1998
    if-eqz v2, :cond_47

    .line 1999
    .line 2000
    move-object v2, v1

    .line 2001
    check-cast v2, Lcom/zykj/mistake/feature/collection/detail/s0;

    .line 2002
    .line 2003
    iget v1, v2, Lcom/zykj/mistake/feature/collection/detail/s0;->a:I

    .line 2004
    .line 2005
    if-ne v1, v3, :cond_46

    .line 2006
    .line 2007
    new-instance v1, Lcom/zykj/mistake/feature/collection/detail/h;

    .line 2008
    .line 2009
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v2

    .line 2013
    check-cast v2, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2014
    .line 2015
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/collection/detail/z0;->d()Ljava/lang/String;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v2

    .line 2019
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v3

    .line 2023
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2024
    .line 2025
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/collection/detail/z0;->c()Ljava/lang/String;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v3

    .line 2029
    invoke-direct {v1, v2, v3}, Lcom/zykj/mistake/feature/collection/detail/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2030
    .line 2031
    .line 2032
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->j(Lcom/zykj/mistake/feature/collection/detail/m;)V

    .line 2033
    .line 2034
    .line 2035
    return-void

    .line 2036
    :cond_46
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v1

    .line 2040
    move-object v6, v1

    .line 2041
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2042
    .line 2043
    iget v3, v2, Lcom/zykj/mistake/feature/collection/detail/s0;->a:I

    .line 2044
    .line 2045
    const v43, -0x8001

    .line 2046
    .line 2047
    .line 2048
    const/16 v44, 0x1f

    .line 2049
    .line 2050
    const/4 v7, 0x0

    .line 2051
    const/4 v8, 0x0

    .line 2052
    const/4 v9, 0x0

    .line 2053
    const/4 v10, 0x0

    .line 2054
    const/4 v11, 0x0

    .line 2055
    const/4 v12, 0x0

    .line 2056
    const/4 v13, 0x0

    .line 2057
    const/4 v14, 0x0

    .line 2058
    const/4 v15, 0x0

    .line 2059
    const/16 v16, 0x0

    .line 2060
    .line 2061
    const/16 v17, 0x0

    .line 2062
    .line 2063
    const/16 v18, 0x0

    .line 2064
    .line 2065
    const/16 v19, 0x0

    .line 2066
    .line 2067
    const/16 v20, 0x0

    .line 2068
    .line 2069
    const/16 v22, 0x0

    .line 2070
    .line 2071
    const/16 v23, 0x0

    .line 2072
    .line 2073
    const/16 v24, 0x0

    .line 2074
    .line 2075
    const/16 v25, 0x0

    .line 2076
    .line 2077
    const/16 v26, 0x0

    .line 2078
    .line 2079
    const/16 v27, 0x0

    .line 2080
    .line 2081
    const/16 v28, 0x0

    .line 2082
    .line 2083
    const/16 v29, 0x0

    .line 2084
    .line 2085
    const/16 v30, 0x0

    .line 2086
    .line 2087
    const/16 v31, 0x0

    .line 2088
    .line 2089
    const/16 v32, 0x0

    .line 2090
    .line 2091
    const/16 v33, 0x0

    .line 2092
    .line 2093
    const/16 v34, 0x0

    .line 2094
    .line 2095
    const/16 v35, 0x0

    .line 2096
    .line 2097
    const/16 v36, 0x0

    .line 2098
    .line 2099
    const/16 v37, 0x0

    .line 2100
    .line 2101
    const/16 v38, 0x0

    .line 2102
    .line 2103
    const/16 v39, 0x0

    .line 2104
    .line 2105
    const/16 v40, 0x0

    .line 2106
    .line 2107
    const/16 v41, 0x0

    .line 2108
    .line 2109
    const/16 v42, 0x0

    .line 2110
    .line 2111
    move/from16 v21, v3

    .line 2112
    .line 2113
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2114
    .line 2115
    .line 2116
    move-result-object v3

    .line 2117
    invoke-virtual {v5, v1, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2118
    .line 2119
    .line 2120
    move-result v1

    .line 2121
    if-eqz v1, :cond_46

    .line 2122
    .line 2123
    goto/16 :goto_16

    .line 2124
    .line 2125
    :cond_47
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/s;->a:Lcom/zykj/mistake/feature/collection/detail/s;

    .line 2126
    .line 2127
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2128
    .line 2129
    .line 2130
    move-result v2

    .line 2131
    if-eqz v2, :cond_49

    .line 2132
    .line 2133
    :cond_48
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v1

    .line 2137
    move-object v6, v1

    .line 2138
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2139
    .line 2140
    invoke-static {}, Lkotlin/collections/j0;->v()Lkotlin/collections/EmptySet;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v25

    .line 2144
    const v43, -0x80001

    .line 2145
    .line 2146
    .line 2147
    const/16 v44, 0x1f

    .line 2148
    .line 2149
    const/4 v7, 0x0

    .line 2150
    const/4 v8, 0x0

    .line 2151
    const/4 v9, 0x0

    .line 2152
    const/4 v10, 0x0

    .line 2153
    const/4 v11, 0x0

    .line 2154
    const/4 v12, 0x0

    .line 2155
    const/4 v13, 0x0

    .line 2156
    const/4 v14, 0x0

    .line 2157
    const/4 v15, 0x0

    .line 2158
    const/16 v16, 0x0

    .line 2159
    .line 2160
    const/16 v17, 0x0

    .line 2161
    .line 2162
    const/16 v18, 0x0

    .line 2163
    .line 2164
    const/16 v19, 0x0

    .line 2165
    .line 2166
    const/16 v20, 0x0

    .line 2167
    .line 2168
    const/16 v21, 0x0

    .line 2169
    .line 2170
    const/16 v22, 0x0

    .line 2171
    .line 2172
    const/16 v23, 0x0

    .line 2173
    .line 2174
    const/16 v24, 0x0

    .line 2175
    .line 2176
    const/16 v26, 0x0

    .line 2177
    .line 2178
    const/16 v27, 0x0

    .line 2179
    .line 2180
    const/16 v28, 0x0

    .line 2181
    .line 2182
    const/16 v29, 0x0

    .line 2183
    .line 2184
    const/16 v30, 0x0

    .line 2185
    .line 2186
    const/16 v31, 0x0

    .line 2187
    .line 2188
    const/16 v32, 0x0

    .line 2189
    .line 2190
    const/16 v33, 0x0

    .line 2191
    .line 2192
    const/16 v34, 0x0

    .line 2193
    .line 2194
    const/16 v35, 0x0

    .line 2195
    .line 2196
    const/16 v36, 0x0

    .line 2197
    .line 2198
    const/16 v37, 0x0

    .line 2199
    .line 2200
    const/16 v38, 0x0

    .line 2201
    .line 2202
    const/16 v39, 0x0

    .line 2203
    .line 2204
    const/16 v40, 0x0

    .line 2205
    .line 2206
    const/16 v41, 0x0

    .line 2207
    .line 2208
    const/16 v42, 0x0

    .line 2209
    .line 2210
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v2

    .line 2214
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2215
    .line 2216
    .line 2217
    move-result v1

    .line 2218
    if-eqz v1, :cond_48

    .line 2219
    .line 2220
    goto/16 :goto_16

    .line 2221
    .line 2222
    :cond_49
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/w0;

    .line 2223
    .line 2224
    if-eqz v2, :cond_4c

    .line 2225
    .line 2226
    :cond_4a
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2227
    .line 2228
    .line 2229
    move-result-object v2

    .line 2230
    move-object v6, v2

    .line 2231
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2232
    .line 2233
    invoke-virtual {v6}, Lcom/zykj/mistake/feature/collection/detail/z0;->h()Ljava/util/Set;

    .line 2234
    .line 2235
    .line 2236
    move-result-object v3

    .line 2237
    check-cast v3, Ljava/lang/Iterable;

    .line 2238
    .line 2239
    invoke-static {v3}, Lkotlin/collections/t;->G0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v3

    .line 2243
    move-object v4, v1

    .line 2244
    check-cast v4, Lcom/zykj/mistake/feature/collection/detail/w0;

    .line 2245
    .line 2246
    iget-wide v7, v4, Lcom/zykj/mistake/feature/collection/detail/w0;->a:J

    .line 2247
    .line 2248
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v4

    .line 2252
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2253
    .line 2254
    .line 2255
    move-result v4

    .line 2256
    if-nez v4, :cond_4b

    .line 2257
    .line 2258
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v4

    .line 2262
    invoke-interface {v3, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2263
    .line 2264
    .line 2265
    :cond_4b
    const v43, -0x80001

    .line 2266
    .line 2267
    .line 2268
    const/16 v44, 0x1f

    .line 2269
    .line 2270
    const/4 v7, 0x0

    .line 2271
    const/4 v8, 0x0

    .line 2272
    const/4 v9, 0x0

    .line 2273
    const/4 v10, 0x0

    .line 2274
    const/4 v11, 0x0

    .line 2275
    const/4 v12, 0x0

    .line 2276
    const/4 v13, 0x0

    .line 2277
    const/4 v14, 0x0

    .line 2278
    const/4 v15, 0x0

    .line 2279
    const/16 v16, 0x0

    .line 2280
    .line 2281
    const/16 v17, 0x0

    .line 2282
    .line 2283
    const/16 v18, 0x0

    .line 2284
    .line 2285
    const/16 v19, 0x0

    .line 2286
    .line 2287
    const/16 v20, 0x0

    .line 2288
    .line 2289
    const/16 v21, 0x0

    .line 2290
    .line 2291
    const/16 v22, 0x0

    .line 2292
    .line 2293
    const/16 v23, 0x0

    .line 2294
    .line 2295
    const/16 v24, 0x0

    .line 2296
    .line 2297
    const/16 v26, 0x0

    .line 2298
    .line 2299
    const/16 v27, 0x0

    .line 2300
    .line 2301
    const/16 v28, 0x0

    .line 2302
    .line 2303
    const/16 v29, 0x0

    .line 2304
    .line 2305
    const/16 v30, 0x0

    .line 2306
    .line 2307
    const/16 v31, 0x0

    .line 2308
    .line 2309
    const/16 v32, 0x0

    .line 2310
    .line 2311
    const/16 v33, 0x0

    .line 2312
    .line 2313
    const/16 v34, 0x0

    .line 2314
    .line 2315
    const/16 v35, 0x0

    .line 2316
    .line 2317
    const/16 v36, 0x0

    .line 2318
    .line 2319
    const/16 v37, 0x0

    .line 2320
    .line 2321
    const/16 v38, 0x0

    .line 2322
    .line 2323
    const/16 v39, 0x0

    .line 2324
    .line 2325
    const/16 v40, 0x0

    .line 2326
    .line 2327
    const/16 v41, 0x0

    .line 2328
    .line 2329
    const/16 v42, 0x0

    .line 2330
    .line 2331
    move-object/from16 v25, v3

    .line 2332
    .line 2333
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2334
    .line 2335
    .line 2336
    move-result-object v3

    .line 2337
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2338
    .line 2339
    .line 2340
    move-result v2

    .line 2341
    if-eqz v2, :cond_4a

    .line 2342
    .line 2343
    goto/16 :goto_16

    .line 2344
    .line 2345
    :cond_4c
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/o0;

    .line 2346
    .line 2347
    if-eqz v2, :cond_4e

    .line 2348
    .line 2349
    :cond_4d
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2350
    .line 2351
    .line 2352
    move-result-object v2

    .line 2353
    move-object v6, v2

    .line 2354
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2355
    .line 2356
    move-object v3, v1

    .line 2357
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/o0;

    .line 2358
    .line 2359
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/collection/detail/o0;->a()Ljava/lang/Integer;

    .line 2360
    .line 2361
    .line 2362
    move-result-object v26

    .line 2363
    const v43, -0x100001

    .line 2364
    .line 2365
    .line 2366
    const/16 v44, 0x1f

    .line 2367
    .line 2368
    const/4 v7, 0x0

    .line 2369
    const/4 v8, 0x0

    .line 2370
    const/4 v9, 0x0

    .line 2371
    const/4 v10, 0x0

    .line 2372
    const/4 v11, 0x0

    .line 2373
    const/4 v12, 0x0

    .line 2374
    const/4 v13, 0x0

    .line 2375
    const/4 v14, 0x0

    .line 2376
    const/4 v15, 0x0

    .line 2377
    const/16 v16, 0x0

    .line 2378
    .line 2379
    const/16 v17, 0x0

    .line 2380
    .line 2381
    const/16 v18, 0x0

    .line 2382
    .line 2383
    const/16 v19, 0x0

    .line 2384
    .line 2385
    const/16 v20, 0x0

    .line 2386
    .line 2387
    const/16 v21, 0x0

    .line 2388
    .line 2389
    const/16 v22, 0x0

    .line 2390
    .line 2391
    const/16 v23, 0x0

    .line 2392
    .line 2393
    const/16 v24, 0x0

    .line 2394
    .line 2395
    const/16 v25, 0x0

    .line 2396
    .line 2397
    const/16 v27, 0x0

    .line 2398
    .line 2399
    const/16 v28, 0x0

    .line 2400
    .line 2401
    const/16 v29, 0x0

    .line 2402
    .line 2403
    const/16 v30, 0x0

    .line 2404
    .line 2405
    const/16 v31, 0x0

    .line 2406
    .line 2407
    const/16 v32, 0x0

    .line 2408
    .line 2409
    const/16 v33, 0x0

    .line 2410
    .line 2411
    const/16 v34, 0x0

    .line 2412
    .line 2413
    const/16 v35, 0x0

    .line 2414
    .line 2415
    const/16 v36, 0x0

    .line 2416
    .line 2417
    const/16 v37, 0x0

    .line 2418
    .line 2419
    const/16 v38, 0x0

    .line 2420
    .line 2421
    const/16 v39, 0x0

    .line 2422
    .line 2423
    const/16 v40, 0x0

    .line 2424
    .line 2425
    const/16 v41, 0x0

    .line 2426
    .line 2427
    const/16 v42, 0x0

    .line 2428
    .line 2429
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2430
    .line 2431
    .line 2432
    move-result-object v3

    .line 2433
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2434
    .line 2435
    .line 2436
    move-result v2

    .line 2437
    if-eqz v2, :cond_4d

    .line 2438
    .line 2439
    goto/16 :goto_16

    .line 2440
    .line 2441
    :cond_4e
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/m0;

    .line 2442
    .line 2443
    if-eqz v2, :cond_50

    .line 2444
    .line 2445
    :cond_4f
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v2

    .line 2449
    move-object v6, v2

    .line 2450
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2451
    .line 2452
    move-object v3, v1

    .line 2453
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/m0;

    .line 2454
    .line 2455
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/collection/detail/m0;->a()Ljava/lang/Integer;

    .line 2456
    .line 2457
    .line 2458
    move-result-object v27

    .line 2459
    const v43, -0x200001

    .line 2460
    .line 2461
    .line 2462
    const/16 v44, 0x1f

    .line 2463
    .line 2464
    const/4 v7, 0x0

    .line 2465
    const/4 v8, 0x0

    .line 2466
    const/4 v9, 0x0

    .line 2467
    const/4 v10, 0x0

    .line 2468
    const/4 v11, 0x0

    .line 2469
    const/4 v12, 0x0

    .line 2470
    const/4 v13, 0x0

    .line 2471
    const/4 v14, 0x0

    .line 2472
    const/4 v15, 0x0

    .line 2473
    const/16 v16, 0x0

    .line 2474
    .line 2475
    const/16 v17, 0x0

    .line 2476
    .line 2477
    const/16 v18, 0x0

    .line 2478
    .line 2479
    const/16 v19, 0x0

    .line 2480
    .line 2481
    const/16 v20, 0x0

    .line 2482
    .line 2483
    const/16 v21, 0x0

    .line 2484
    .line 2485
    const/16 v22, 0x0

    .line 2486
    .line 2487
    const/16 v23, 0x0

    .line 2488
    .line 2489
    const/16 v24, 0x0

    .line 2490
    .line 2491
    const/16 v25, 0x0

    .line 2492
    .line 2493
    const/16 v26, 0x0

    .line 2494
    .line 2495
    const/16 v28, 0x0

    .line 2496
    .line 2497
    const/16 v29, 0x0

    .line 2498
    .line 2499
    const/16 v30, 0x0

    .line 2500
    .line 2501
    const/16 v31, 0x0

    .line 2502
    .line 2503
    const/16 v32, 0x0

    .line 2504
    .line 2505
    const/16 v33, 0x0

    .line 2506
    .line 2507
    const/16 v34, 0x0

    .line 2508
    .line 2509
    const/16 v35, 0x0

    .line 2510
    .line 2511
    const/16 v36, 0x0

    .line 2512
    .line 2513
    const/16 v37, 0x0

    .line 2514
    .line 2515
    const/16 v38, 0x0

    .line 2516
    .line 2517
    const/16 v39, 0x0

    .line 2518
    .line 2519
    const/16 v40, 0x0

    .line 2520
    .line 2521
    const/16 v41, 0x0

    .line 2522
    .line 2523
    const/16 v42, 0x0

    .line 2524
    .line 2525
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v3

    .line 2529
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2530
    .line 2531
    .line 2532
    move-result v2

    .line 2533
    if-eqz v2, :cond_4f

    .line 2534
    .line 2535
    goto/16 :goto_16

    .line 2536
    .line 2537
    :cond_50
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/p0;

    .line 2538
    .line 2539
    if-eqz v2, :cond_52

    .line 2540
    .line 2541
    :cond_51
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2542
    .line 2543
    .line 2544
    move-result-object v2

    .line 2545
    move-object v6, v2

    .line 2546
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2547
    .line 2548
    move-object v3, v1

    .line 2549
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/p0;

    .line 2550
    .line 2551
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/collection/detail/p0;->a()Ljava/lang/Integer;

    .line 2552
    .line 2553
    .line 2554
    move-result-object v28

    .line 2555
    const v43, -0x400001

    .line 2556
    .line 2557
    .line 2558
    const/16 v44, 0x1f

    .line 2559
    .line 2560
    const/4 v7, 0x0

    .line 2561
    const/4 v8, 0x0

    .line 2562
    const/4 v9, 0x0

    .line 2563
    const/4 v10, 0x0

    .line 2564
    const/4 v11, 0x0

    .line 2565
    const/4 v12, 0x0

    .line 2566
    const/4 v13, 0x0

    .line 2567
    const/4 v14, 0x0

    .line 2568
    const/4 v15, 0x0

    .line 2569
    const/16 v16, 0x0

    .line 2570
    .line 2571
    const/16 v17, 0x0

    .line 2572
    .line 2573
    const/16 v18, 0x0

    .line 2574
    .line 2575
    const/16 v19, 0x0

    .line 2576
    .line 2577
    const/16 v20, 0x0

    .line 2578
    .line 2579
    const/16 v21, 0x0

    .line 2580
    .line 2581
    const/16 v22, 0x0

    .line 2582
    .line 2583
    const/16 v23, 0x0

    .line 2584
    .line 2585
    const/16 v24, 0x0

    .line 2586
    .line 2587
    const/16 v25, 0x0

    .line 2588
    .line 2589
    const/16 v26, 0x0

    .line 2590
    .line 2591
    const/16 v27, 0x0

    .line 2592
    .line 2593
    const/16 v29, 0x0

    .line 2594
    .line 2595
    const/16 v30, 0x0

    .line 2596
    .line 2597
    const/16 v31, 0x0

    .line 2598
    .line 2599
    const/16 v32, 0x0

    .line 2600
    .line 2601
    const/16 v33, 0x0

    .line 2602
    .line 2603
    const/16 v34, 0x0

    .line 2604
    .line 2605
    const/16 v35, 0x0

    .line 2606
    .line 2607
    const/16 v36, 0x0

    .line 2608
    .line 2609
    const/16 v37, 0x0

    .line 2610
    .line 2611
    const/16 v38, 0x0

    .line 2612
    .line 2613
    const/16 v39, 0x0

    .line 2614
    .line 2615
    const/16 v40, 0x0

    .line 2616
    .line 2617
    const/16 v41, 0x0

    .line 2618
    .line 2619
    const/16 v42, 0x0

    .line 2620
    .line 2621
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2622
    .line 2623
    .line 2624
    move-result-object v3

    .line 2625
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2626
    .line 2627
    .line 2628
    move-result v2

    .line 2629
    if-eqz v2, :cond_51

    .line 2630
    .line 2631
    goto/16 :goto_16

    .line 2632
    .line 2633
    :cond_52
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/n0;

    .line 2634
    .line 2635
    if-eqz v2, :cond_54

    .line 2636
    .line 2637
    :cond_53
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2638
    .line 2639
    .line 2640
    move-result-object v2

    .line 2641
    move-object v6, v2

    .line 2642
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2643
    .line 2644
    move-object v3, v1

    .line 2645
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/n0;

    .line 2646
    .line 2647
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/collection/detail/n0;->a()I

    .line 2648
    .line 2649
    .line 2650
    move-result v29

    .line 2651
    const v43, -0x800001

    .line 2652
    .line 2653
    .line 2654
    const/16 v44, 0x1f

    .line 2655
    .line 2656
    const/4 v7, 0x0

    .line 2657
    const/4 v8, 0x0

    .line 2658
    const/4 v9, 0x0

    .line 2659
    const/4 v10, 0x0

    .line 2660
    const/4 v11, 0x0

    .line 2661
    const/4 v12, 0x0

    .line 2662
    const/4 v13, 0x0

    .line 2663
    const/4 v14, 0x0

    .line 2664
    const/4 v15, 0x0

    .line 2665
    const/16 v16, 0x0

    .line 2666
    .line 2667
    const/16 v17, 0x0

    .line 2668
    .line 2669
    const/16 v18, 0x0

    .line 2670
    .line 2671
    const/16 v19, 0x0

    .line 2672
    .line 2673
    const/16 v20, 0x0

    .line 2674
    .line 2675
    const/16 v21, 0x0

    .line 2676
    .line 2677
    const/16 v22, 0x0

    .line 2678
    .line 2679
    const/16 v23, 0x0

    .line 2680
    .line 2681
    const/16 v24, 0x0

    .line 2682
    .line 2683
    const/16 v25, 0x0

    .line 2684
    .line 2685
    const/16 v26, 0x0

    .line 2686
    .line 2687
    const/16 v27, 0x0

    .line 2688
    .line 2689
    const/16 v28, 0x0

    .line 2690
    .line 2691
    const/16 v30, 0x0

    .line 2692
    .line 2693
    const/16 v31, 0x0

    .line 2694
    .line 2695
    const/16 v32, 0x0

    .line 2696
    .line 2697
    const/16 v33, 0x0

    .line 2698
    .line 2699
    const/16 v34, 0x0

    .line 2700
    .line 2701
    const/16 v35, 0x0

    .line 2702
    .line 2703
    const/16 v36, 0x0

    .line 2704
    .line 2705
    const/16 v37, 0x0

    .line 2706
    .line 2707
    const/16 v38, 0x0

    .line 2708
    .line 2709
    const/16 v39, 0x0

    .line 2710
    .line 2711
    const/16 v40, 0x0

    .line 2712
    .line 2713
    const/16 v41, 0x0

    .line 2714
    .line 2715
    const/16 v42, 0x0

    .line 2716
    .line 2717
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2718
    .line 2719
    .line 2720
    move-result-object v3

    .line 2721
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2722
    .line 2723
    .line 2724
    move-result v2

    .line 2725
    if-eqz v2, :cond_53

    .line 2726
    .line 2727
    goto/16 :goto_16

    .line 2728
    .line 2729
    :cond_54
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/r0;

    .line 2730
    .line 2731
    if-eqz v2, :cond_56

    .line 2732
    .line 2733
    :cond_55
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2734
    .line 2735
    .line 2736
    move-result-object v2

    .line 2737
    move-object v6, v2

    .line 2738
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2739
    .line 2740
    move-object v3, v1

    .line 2741
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/r0;

    .line 2742
    .line 2743
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/collection/detail/r0;->a()I

    .line 2744
    .line 2745
    .line 2746
    move-result v30

    .line 2747
    const v43, -0x1000001

    .line 2748
    .line 2749
    .line 2750
    const/16 v44, 0x1f

    .line 2751
    .line 2752
    const/4 v7, 0x0

    .line 2753
    const/4 v8, 0x0

    .line 2754
    const/4 v9, 0x0

    .line 2755
    const/4 v10, 0x0

    .line 2756
    const/4 v11, 0x0

    .line 2757
    const/4 v12, 0x0

    .line 2758
    const/4 v13, 0x0

    .line 2759
    const/4 v14, 0x0

    .line 2760
    const/4 v15, 0x0

    .line 2761
    const/16 v16, 0x0

    .line 2762
    .line 2763
    const/16 v17, 0x0

    .line 2764
    .line 2765
    const/16 v18, 0x0

    .line 2766
    .line 2767
    const/16 v19, 0x0

    .line 2768
    .line 2769
    const/16 v20, 0x0

    .line 2770
    .line 2771
    const/16 v21, 0x0

    .line 2772
    .line 2773
    const/16 v22, 0x0

    .line 2774
    .line 2775
    const/16 v23, 0x0

    .line 2776
    .line 2777
    const/16 v24, 0x0

    .line 2778
    .line 2779
    const/16 v25, 0x0

    .line 2780
    .line 2781
    const/16 v26, 0x0

    .line 2782
    .line 2783
    const/16 v27, 0x0

    .line 2784
    .line 2785
    const/16 v28, 0x0

    .line 2786
    .line 2787
    const/16 v29, 0x0

    .line 2788
    .line 2789
    const/16 v31, 0x0

    .line 2790
    .line 2791
    const/16 v32, 0x0

    .line 2792
    .line 2793
    const/16 v33, 0x0

    .line 2794
    .line 2795
    const/16 v34, 0x0

    .line 2796
    .line 2797
    const/16 v35, 0x0

    .line 2798
    .line 2799
    const/16 v36, 0x0

    .line 2800
    .line 2801
    const/16 v37, 0x0

    .line 2802
    .line 2803
    const/16 v38, 0x0

    .line 2804
    .line 2805
    const/16 v39, 0x0

    .line 2806
    .line 2807
    const/16 v40, 0x0

    .line 2808
    .line 2809
    const/16 v41, 0x0

    .line 2810
    .line 2811
    const/16 v42, 0x0

    .line 2812
    .line 2813
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2814
    .line 2815
    .line 2816
    move-result-object v3

    .line 2817
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2818
    .line 2819
    .line 2820
    move-result v2

    .line 2821
    if-eqz v2, :cond_55

    .line 2822
    .line 2823
    goto/16 :goto_16

    .line 2824
    .line 2825
    :cond_56
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/t;->a:Lcom/zykj/mistake/feature/collection/detail/t;

    .line 2826
    .line 2827
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2828
    .line 2829
    .line 2830
    move-result v2

    .line 2831
    if-eqz v2, :cond_58

    .line 2832
    .line 2833
    :cond_57
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2834
    .line 2835
    .line 2836
    move-result-object v1

    .line 2837
    move-object v6, v1

    .line 2838
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2839
    .line 2840
    invoke-static {}, Lkotlin/collections/j0;->v()Lkotlin/collections/EmptySet;

    .line 2841
    .line 2842
    .line 2843
    move-result-object v33

    .line 2844
    const v43, -0xc000001

    .line 2845
    .line 2846
    .line 2847
    const/16 v44, 0x1f

    .line 2848
    .line 2849
    const/4 v7, 0x0

    .line 2850
    const/4 v8, 0x0

    .line 2851
    const/4 v9, 0x0

    .line 2852
    const/4 v10, 0x0

    .line 2853
    const/4 v11, 0x0

    .line 2854
    const/4 v12, 0x0

    .line 2855
    const/4 v13, 0x0

    .line 2856
    const/4 v14, 0x0

    .line 2857
    const/4 v15, 0x0

    .line 2858
    const/16 v16, 0x0

    .line 2859
    .line 2860
    const/16 v17, 0x0

    .line 2861
    .line 2862
    const/16 v18, 0x0

    .line 2863
    .line 2864
    const/16 v19, 0x0

    .line 2865
    .line 2866
    const/16 v20, 0x0

    .line 2867
    .line 2868
    const/16 v21, 0x0

    .line 2869
    .line 2870
    const/16 v22, 0x0

    .line 2871
    .line 2872
    const/16 v23, 0x0

    .line 2873
    .line 2874
    const/16 v24, 0x0

    .line 2875
    .line 2876
    const/16 v25, 0x0

    .line 2877
    .line 2878
    const/16 v26, 0x0

    .line 2879
    .line 2880
    const/16 v27, 0x0

    .line 2881
    .line 2882
    const/16 v28, 0x0

    .line 2883
    .line 2884
    const/16 v29, 0x0

    .line 2885
    .line 2886
    const/16 v30, 0x0

    .line 2887
    .line 2888
    const/16 v31, 0x0

    .line 2889
    .line 2890
    const/16 v32, 0x0

    .line 2891
    .line 2892
    const/16 v34, 0x0

    .line 2893
    .line 2894
    const/16 v35, 0x0

    .line 2895
    .line 2896
    const/16 v36, 0x0

    .line 2897
    .line 2898
    const/16 v37, 0x0

    .line 2899
    .line 2900
    const/16 v38, 0x0

    .line 2901
    .line 2902
    const/16 v39, 0x0

    .line 2903
    .line 2904
    const/16 v40, 0x0

    .line 2905
    .line 2906
    const/16 v41, 0x0

    .line 2907
    .line 2908
    const/16 v42, 0x0

    .line 2909
    .line 2910
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2911
    .line 2912
    .line 2913
    move-result-object v2

    .line 2914
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2915
    .line 2916
    .line 2917
    move-result v1

    .line 2918
    if-eqz v1, :cond_57

    .line 2919
    .line 2920
    goto/16 :goto_16

    .line 2921
    .line 2922
    :cond_58
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/q0;->a:Lcom/zykj/mistake/feature/collection/detail/q0;

    .line 2923
    .line 2924
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2925
    .line 2926
    .line 2927
    move-result v2

    .line 2928
    if-eqz v2, :cond_5a

    .line 2929
    .line 2930
    :cond_59
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2931
    .line 2932
    .line 2933
    move-result-object v1

    .line 2934
    move-object v6, v1

    .line 2935
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 2936
    .line 2937
    invoke-virtual {v6}, Lcom/zykj/mistake/feature/collection/detail/z0;->f()Z

    .line 2938
    .line 2939
    .line 2940
    move-result v2

    .line 2941
    const/16 v46, 0x1

    .line 2942
    .line 2943
    xor-int/lit8 v32, v2, 0x1

    .line 2944
    .line 2945
    const v43, -0x4000001

    .line 2946
    .line 2947
    .line 2948
    const/16 v44, 0x1f

    .line 2949
    .line 2950
    const/4 v7, 0x0

    .line 2951
    const/4 v8, 0x0

    .line 2952
    const/4 v9, 0x0

    .line 2953
    const/4 v10, 0x0

    .line 2954
    const/4 v11, 0x0

    .line 2955
    const/4 v12, 0x0

    .line 2956
    const/4 v13, 0x0

    .line 2957
    const/4 v14, 0x0

    .line 2958
    const/4 v15, 0x0

    .line 2959
    const/16 v16, 0x0

    .line 2960
    .line 2961
    const/16 v17, 0x0

    .line 2962
    .line 2963
    const/16 v18, 0x0

    .line 2964
    .line 2965
    const/16 v19, 0x0

    .line 2966
    .line 2967
    const/16 v20, 0x0

    .line 2968
    .line 2969
    const/16 v21, 0x0

    .line 2970
    .line 2971
    const/16 v22, 0x0

    .line 2972
    .line 2973
    const/16 v23, 0x0

    .line 2974
    .line 2975
    const/16 v24, 0x0

    .line 2976
    .line 2977
    const/16 v25, 0x0

    .line 2978
    .line 2979
    const/16 v26, 0x0

    .line 2980
    .line 2981
    const/16 v27, 0x0

    .line 2982
    .line 2983
    const/16 v28, 0x0

    .line 2984
    .line 2985
    const/16 v29, 0x0

    .line 2986
    .line 2987
    const/16 v30, 0x0

    .line 2988
    .line 2989
    const/16 v31, 0x0

    .line 2990
    .line 2991
    const/16 v33, 0x0

    .line 2992
    .line 2993
    const/16 v34, 0x0

    .line 2994
    .line 2995
    const/16 v35, 0x0

    .line 2996
    .line 2997
    const/16 v36, 0x0

    .line 2998
    .line 2999
    const/16 v37, 0x0

    .line 3000
    .line 3001
    const/16 v38, 0x0

    .line 3002
    .line 3003
    const/16 v39, 0x0

    .line 3004
    .line 3005
    const/16 v40, 0x0

    .line 3006
    .line 3007
    const/16 v41, 0x0

    .line 3008
    .line 3009
    const/16 v42, 0x0

    .line 3010
    .line 3011
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 3012
    .line 3013
    .line 3014
    move-result-object v2

    .line 3015
    invoke-virtual {v5, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3016
    .line 3017
    .line 3018
    move-result v1

    .line 3019
    if-eqz v1, :cond_59

    .line 3020
    .line 3021
    goto/16 :goto_16

    .line 3022
    .line 3023
    :cond_5a
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/x0;

    .line 3024
    .line 3025
    if-eqz v2, :cond_5e

    .line 3026
    .line 3027
    :cond_5b
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 3028
    .line 3029
    .line 3030
    move-result-object v2

    .line 3031
    move-object v6, v2

    .line 3032
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 3033
    .line 3034
    invoke-virtual {v6}, Lcom/zykj/mistake/feature/collection/detail/z0;->i()Ljava/util/Set;

    .line 3035
    .line 3036
    .line 3037
    move-result-object v3

    .line 3038
    check-cast v3, Ljava/lang/Iterable;

    .line 3039
    .line 3040
    invoke-static {v3}, Lkotlin/collections/t;->G0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 3041
    .line 3042
    .line 3043
    move-result-object v3

    .line 3044
    move-object v4, v1

    .line 3045
    check-cast v4, Lcom/zykj/mistake/feature/collection/detail/x0;

    .line 3046
    .line 3047
    iget-wide v7, v4, Lcom/zykj/mistake/feature/collection/detail/x0;->a:J

    .line 3048
    .line 3049
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3050
    .line 3051
    .line 3052
    move-result-object v4

    .line 3053
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 3054
    .line 3055
    .line 3056
    move-result v4

    .line 3057
    if-nez v4, :cond_5c

    .line 3058
    .line 3059
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3060
    .line 3061
    .line 3062
    move-result-object v4

    .line 3063
    invoke-interface {v3, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 3064
    .line 3065
    .line 3066
    :cond_5c
    const v43, -0x8000001

    .line 3067
    .line 3068
    .line 3069
    const/16 v44, 0x1f

    .line 3070
    .line 3071
    const/4 v7, 0x0

    .line 3072
    const/4 v8, 0x0

    .line 3073
    const/4 v9, 0x0

    .line 3074
    const/4 v10, 0x0

    .line 3075
    const/4 v11, 0x0

    .line 3076
    const/4 v12, 0x0

    .line 3077
    const/4 v13, 0x0

    .line 3078
    const/4 v14, 0x0

    .line 3079
    const/4 v15, 0x0

    .line 3080
    const/16 v16, 0x0

    .line 3081
    .line 3082
    const/16 v17, 0x0

    .line 3083
    .line 3084
    const/16 v18, 0x0

    .line 3085
    .line 3086
    const/16 v19, 0x0

    .line 3087
    .line 3088
    const/16 v20, 0x0

    .line 3089
    .line 3090
    const/16 v21, 0x0

    .line 3091
    .line 3092
    const/16 v22, 0x0

    .line 3093
    .line 3094
    const/16 v23, 0x0

    .line 3095
    .line 3096
    const/16 v24, 0x0

    .line 3097
    .line 3098
    const/16 v25, 0x0

    .line 3099
    .line 3100
    const/16 v26, 0x0

    .line 3101
    .line 3102
    const/16 v27, 0x0

    .line 3103
    .line 3104
    const/16 v28, 0x0

    .line 3105
    .line 3106
    const/16 v29, 0x0

    .line 3107
    .line 3108
    const/16 v30, 0x0

    .line 3109
    .line 3110
    const/16 v31, 0x0

    .line 3111
    .line 3112
    const/16 v32, 0x0

    .line 3113
    .line 3114
    const/16 v34, 0x0

    .line 3115
    .line 3116
    const/16 v35, 0x0

    .line 3117
    .line 3118
    const/16 v36, 0x0

    .line 3119
    .line 3120
    const/16 v37, 0x0

    .line 3121
    .line 3122
    const/16 v38, 0x0

    .line 3123
    .line 3124
    const/16 v39, 0x0

    .line 3125
    .line 3126
    const/16 v40, 0x0

    .line 3127
    .line 3128
    const/16 v41, 0x0

    .line 3129
    .line 3130
    const/16 v42, 0x0

    .line 3131
    .line 3132
    move-object/from16 v33, v3

    .line 3133
    .line 3134
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 3135
    .line 3136
    .line 3137
    move-result-object v3

    .line 3138
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3139
    .line 3140
    .line 3141
    move-result v2

    .line 3142
    if-eqz v2, :cond_5b

    .line 3143
    .line 3144
    :cond_5d
    :goto_16
    return-void

    .line 3145
    :cond_5e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 3146
    .line 3147
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 3148
    .line 3149
    .line 3150
    throw v1
.end method

.method public final e()V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

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
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 11
    .line 12
    const v40, -0x10000001

    .line 13
    .line 14
    .line 15
    const/16 v41, 0x1f

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x0

    .line 32
    .line 33
    const/16 v18, 0x0

    .line 34
    .line 35
    const/16 v19, 0x0

    .line 36
    .line 37
    const/16 v20, 0x0

    .line 38
    .line 39
    const/16 v21, 0x0

    .line 40
    .line 41
    const/16 v22, 0x0

    .line 42
    .line 43
    const/16 v23, 0x0

    .line 44
    .line 45
    const/16 v24, 0x0

    .line 46
    .line 47
    const/16 v25, 0x0

    .line 48
    .line 49
    const/16 v26, 0x0

    .line 50
    .line 51
    const/16 v27, 0x0

    .line 52
    .line 53
    const/16 v28, 0x0

    .line 54
    .line 55
    const/16 v29, 0x0

    .line 56
    .line 57
    const/16 v30, 0x0

    .line 58
    .line 59
    const/16 v31, 0x1

    .line 60
    .line 61
    const/16 v32, 0x0

    .line 62
    .line 63
    const/16 v33, 0x0

    .line 64
    .line 65
    const/16 v34, 0x0

    .line 66
    .line 67
    const/16 v35, 0x0

    .line 68
    .line 69
    const/16 v36, 0x0

    .line 70
    .line 71
    const/16 v37, 0x0

    .line 72
    .line 73
    const/16 v38, 0x0

    .line 74
    .line 75
    const/16 v39, 0x0

    .line 76
    .line 77
    invoke-static/range {v3 .. v41}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    new-instance v1, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$loadFilterOptions$2;

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    invoke-direct {v1, v0, v2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$loadFilterOptions$2;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lh6/c;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Landroidx/navigation/i;

    .line 94
    .line 95
    const/4 v4, 0x4

    .line 96
    invoke-direct {v3, v0, v4}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    new-instance v4, Landroidx/navigation/b;

    .line 100
    .line 101
    const/4 v5, 0x7

    .line 102
    invoke-direct {v4, v0, v5}, Landroidx/navigation/b;-><init>(Ljava/lang/Object;I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    new-instance v6, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestApi$2;

    .line 110
    .line 111
    invoke-direct {v6, v1, v3, v4, v2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestApi$2;-><init>(Lr6/c;Lr6/c;Lr6/a;Lh6/c;)V

    .line 112
    .line 113
    .line 114
    const/4 v1, 0x3

    .line 115
    invoke-static {v5, v2, v2, v6, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lp4/b;

    .line 27
    .line 28
    iget-object v3, v3, Lp4/b;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    :goto_1
    move v13, v2

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v2, -0x1

    .line 42
    goto :goto_1

    .line 43
    :goto_2
    if-gez v13, :cond_2

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lp4/b;

    .line 51
    .line 52
    new-instance v12, Ljava/util/ArrayList;

    .line 53
    .line 54
    const/16 v1, 0xa

    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Lp4/b;

    .line 78
    .line 79
    invoke-static {v1}, La/a;->q(Lp4/b;)Lp4/e;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/j;

    .line 88
    .line 89
    iget v4, p1, Lp4/b;->b:I

    .line 90
    .line 91
    iget v5, p1, Lp4/b;->c:I

    .line 92
    .line 93
    iget-wide v6, p1, Lp4/b;->d:J

    .line 94
    .line 95
    iget-object v8, p1, Lp4/b;->i:Ljava/lang/String;

    .line 96
    .line 97
    iget-boolean v9, p1, Lp4/b;->l:Z

    .line 98
    .line 99
    iget-boolean v10, p1, Lp4/b;->j:Z

    .line 100
    .line 101
    sget-object v11, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 102
    .line 103
    invoke-direct/range {v3 .. v13}, Lcom/zykj/mistake/feature/collection/detail/j;-><init>(IIJLjava/lang/String;ZZLkotlin/collections/EmptyList;Ljava/util/ArrayList;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v3}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->j(Lcom/zykj/mistake/feature/collection/detail/m;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final g(Ljava/util/Set;)V
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 14
    .line 15
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    move-object v4, v3

    .line 20
    check-cast v4, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 21
    .line 22
    iget-object v5, v4, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_1

    .line 32
    .line 33
    move v7, v6

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    move v7, v6

    .line 40
    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-eqz v8, :cond_4

    .line 45
    .line 46
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    check-cast v8, Lp4/b;

    .line 51
    .line 52
    iget v8, v8, Lp4/b;->c:I

    .line 53
    .line 54
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-interface {v1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-eqz v8, :cond_2

    .line 63
    .line 64
    add-int/lit8 v7, v7, 0x1

    .line 65
    .line 66
    if-ltz v7, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-static {}, Lkotlin/collections/u;->K()V

    .line 70
    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    throw v1

    .line 74
    :cond_4
    :goto_1
    iget-object v5, v4, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 75
    .line 76
    new-instance v11, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    :cond_5
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-eqz v8, :cond_6

    .line 90
    .line 91
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    move-object v9, v8

    .line 96
    check-cast v9, Lp4/b;

    .line 97
    .line 98
    iget v9, v9, Lp4/b;->c:I

    .line 99
    .line 100
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-nez v9, :cond_5

    .line 109
    .line 110
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_6
    const/4 v5, 0x1

    .line 115
    if-lez v7, :cond_7

    .line 116
    .line 117
    move/from16 v43, v5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_7
    move/from16 v43, v6

    .line 121
    .line 122
    :goto_3
    if-nez v43, :cond_8

    .line 123
    .line 124
    sget-object v38, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 125
    .line 126
    const/16 v41, -0x1

    .line 127
    .line 128
    const/16 v42, 0x11

    .line 129
    .line 130
    const/4 v5, 0x0

    .line 131
    const/4 v6, 0x0

    .line 132
    const/4 v7, 0x0

    .line 133
    const/4 v8, 0x0

    .line 134
    const/4 v9, 0x0

    .line 135
    const/4 v10, 0x0

    .line 136
    const/4 v11, 0x0

    .line 137
    const/4 v12, 0x0

    .line 138
    const/4 v13, 0x0

    .line 139
    const/4 v14, 0x0

    .line 140
    const/4 v15, 0x0

    .line 141
    const/16 v16, 0x0

    .line 142
    .line 143
    const/16 v17, 0x0

    .line 144
    .line 145
    const/16 v18, 0x0

    .line 146
    .line 147
    const/16 v19, 0x0

    .line 148
    .line 149
    const/16 v20, 0x0

    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const/16 v22, 0x0

    .line 154
    .line 155
    const/16 v23, 0x0

    .line 156
    .line 157
    const/16 v24, 0x0

    .line 158
    .line 159
    const/16 v25, 0x0

    .line 160
    .line 161
    const/16 v26, 0x0

    .line 162
    .line 163
    const/16 v27, 0x0

    .line 164
    .line 165
    const/16 v28, 0x0

    .line 166
    .line 167
    const/16 v29, 0x0

    .line 168
    .line 169
    const/16 v30, 0x0

    .line 170
    .line 171
    const/16 v31, 0x0

    .line 172
    .line 173
    const/16 v32, 0x0

    .line 174
    .line 175
    const/16 v33, 0x0

    .line 176
    .line 177
    const/16 v34, 0x0

    .line 178
    .line 179
    const/16 v35, 0x0

    .line 180
    .line 181
    const/16 v36, 0x0

    .line 182
    .line 183
    const/16 v37, 0x0

    .line 184
    .line 185
    const/16 v39, 0x0

    .line 186
    .line 187
    const/16 v40, 0x0

    .line 188
    .line 189
    invoke-static/range {v4 .. v42}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    goto :goto_6

    .line 194
    :cond_8
    iget v8, v4, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    .line 195
    .line 196
    sub-int/2addr v8, v7

    .line 197
    if-gez v8, :cond_9

    .line 198
    .line 199
    move v7, v6

    .line 200
    goto :goto_4

    .line 201
    :cond_9
    move v7, v8

    .line 202
    :goto_4
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-ge v8, v7, :cond_a

    .line 207
    .line 208
    move/from16 v16, v5

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_a
    move/from16 v16, v6

    .line 212
    .line 213
    :goto_5
    sget-object v38, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 214
    .line 215
    const/16 v41, -0x1085

    .line 216
    .line 217
    const/16 v42, 0x11

    .line 218
    .line 219
    const/4 v5, 0x0

    .line 220
    const/4 v6, 0x0

    .line 221
    const/4 v8, 0x0

    .line 222
    const/4 v9, 0x0

    .line 223
    const/4 v10, 0x0

    .line 224
    const/4 v12, 0x0

    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    const/16 v17, 0x0

    .line 229
    .line 230
    const/16 v18, 0x0

    .line 231
    .line 232
    const/16 v19, 0x0

    .line 233
    .line 234
    const/16 v20, 0x0

    .line 235
    .line 236
    const/16 v21, 0x0

    .line 237
    .line 238
    const/16 v22, 0x0

    .line 239
    .line 240
    const/16 v23, 0x0

    .line 241
    .line 242
    const/16 v24, 0x0

    .line 243
    .line 244
    const/16 v25, 0x0

    .line 245
    .line 246
    const/16 v26, 0x0

    .line 247
    .line 248
    const/16 v27, 0x0

    .line 249
    .line 250
    const/16 v28, 0x0

    .line 251
    .line 252
    const/16 v29, 0x0

    .line 253
    .line 254
    const/16 v30, 0x0

    .line 255
    .line 256
    const/16 v31, 0x0

    .line 257
    .line 258
    const/16 v32, 0x0

    .line 259
    .line 260
    const/16 v33, 0x0

    .line 261
    .line 262
    const/16 v34, 0x0

    .line 263
    .line 264
    const/16 v35, 0x0

    .line 265
    .line 266
    const/16 v36, 0x0

    .line 267
    .line 268
    const/16 v37, 0x0

    .line 269
    .line 270
    const/16 v39, 0x0

    .line 271
    .line 272
    const/16 v40, 0x0

    .line 273
    .line 274
    invoke-static/range {v4 .. v42}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    :goto_6
    invoke-virtual {v2, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-eqz v2, :cond_0

    .line 283
    .line 284
    if-eqz v43, :cond_b

    .line 285
    .line 286
    sget-object v1, Lcom/zykj/mistake/feature/collection/detail/k;->a:Lcom/zykj/mistake/feature/collection/detail/k;

    .line 287
    .line 288
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->j(Lcom/zykj/mistake/feature/collection/detail/m;)V

    .line 289
    .line 290
    .line 291
    :cond_b
    :goto_7
    return-void
.end method

.method public final h(Z)V
    .locals 45

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 10
    .line 11
    iget-object v3, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v3}, Lkotlin/text/w;->D(Ljava/lang/String;)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eqz v3, :cond_4

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    move v3, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget-object v2, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    if-eqz p1, :cond_2

    .line 36
    .line 37
    :cond_1
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    move-object v6, v2

    .line 42
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 43
    .line 44
    sget-object v40, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 45
    .line 46
    const/16 v43, -0x1c01

    .line 47
    .line 48
    const/16 v44, 0x19

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    const/4 v14, 0x0

    .line 58
    const/4 v15, 0x0

    .line 59
    const/16 v16, 0x1

    .line 60
    .line 61
    const/16 v17, 0x0

    .line 62
    .line 63
    const/16 v18, 0x1

    .line 64
    .line 65
    const/16 v19, 0x0

    .line 66
    .line 67
    const/16 v20, 0x0

    .line 68
    .line 69
    const/16 v21, 0x0

    .line 70
    .line 71
    const/16 v22, 0x0

    .line 72
    .line 73
    const/16 v23, 0x0

    .line 74
    .line 75
    const/16 v24, 0x0

    .line 76
    .line 77
    const/16 v25, 0x0

    .line 78
    .line 79
    const/16 v26, 0x0

    .line 80
    .line 81
    const/16 v27, 0x0

    .line 82
    .line 83
    const/16 v28, 0x0

    .line 84
    .line 85
    const/16 v29, 0x0

    .line 86
    .line 87
    const/16 v30, 0x0

    .line 88
    .line 89
    const/16 v31, 0x0

    .line 90
    .line 91
    const/16 v32, 0x0

    .line 92
    .line 93
    const/16 v33, 0x0

    .line 94
    .line 95
    const/16 v34, 0x0

    .line 96
    .line 97
    const/16 v35, 0x0

    .line 98
    .line 99
    const/16 v36, 0x0

    .line 100
    .line 101
    const/16 v37, 0x0

    .line 102
    .line 103
    const/16 v38, 0x0

    .line 104
    .line 105
    const/16 v39, 0x0

    .line 106
    .line 107
    const/16 v41, 0x0

    .line 108
    .line 109
    const/16 v42, 0x0

    .line 110
    .line 111
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v0, v2, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_1

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_2
    :goto_2
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    move-object v6, v2

    .line 127
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 128
    .line 129
    const/16 v43, -0x801

    .line 130
    .line 131
    const/16 v44, 0x1f

    .line 132
    .line 133
    const/4 v7, 0x0

    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v9, 0x0

    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v11, 0x0

    .line 138
    const/4 v12, 0x0

    .line 139
    const/4 v13, 0x0

    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x0

    .line 142
    const/16 v16, 0x0

    .line 143
    .line 144
    const/16 v17, 0x1

    .line 145
    .line 146
    const/16 v18, 0x0

    .line 147
    .line 148
    const/16 v19, 0x0

    .line 149
    .line 150
    const/16 v20, 0x0

    .line 151
    .line 152
    const/16 v21, 0x0

    .line 153
    .line 154
    const/16 v22, 0x0

    .line 155
    .line 156
    const/16 v23, 0x0

    .line 157
    .line 158
    const/16 v24, 0x0

    .line 159
    .line 160
    const/16 v25, 0x0

    .line 161
    .line 162
    const/16 v26, 0x0

    .line 163
    .line 164
    const/16 v27, 0x0

    .line 165
    .line 166
    const/16 v28, 0x0

    .line 167
    .line 168
    const/16 v29, 0x0

    .line 169
    .line 170
    const/16 v30, 0x0

    .line 171
    .line 172
    const/16 v31, 0x0

    .line 173
    .line 174
    const/16 v32, 0x0

    .line 175
    .line 176
    const/16 v33, 0x0

    .line 177
    .line 178
    const/16 v34, 0x0

    .line 179
    .line 180
    const/16 v35, 0x0

    .line 181
    .line 182
    const/16 v36, 0x0

    .line 183
    .line 184
    const/16 v37, 0x0

    .line 185
    .line 186
    const/16 v38, 0x0

    .line 187
    .line 188
    const/16 v39, 0x0

    .line 189
    .line 190
    const/16 v40, 0x0

    .line 191
    .line 192
    const/16 v41, 0x0

    .line 193
    .line 194
    const/16 v42, 0x0

    .line 195
    .line 196
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-virtual {v0, v2, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_3

    .line 205
    .line 206
    :goto_3
    new-instance v2, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;

    .line 207
    .line 208
    const/4 v7, 0x1

    .line 209
    const/16 v9, 0x14

    .line 210
    .line 211
    const/4 v6, 0x0

    .line 212
    move-object v4, v2

    .line 213
    move v8, v3

    .line 214
    invoke-direct/range {v4 .. v9}, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;-><init>(IIIII)V

    .line 215
    .line 216
    .line 217
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;

    .line 222
    .line 223
    const/4 v5, 0x0

    .line 224
    move/from16 v4, p1

    .line 225
    .line 226
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;IZLh6/c;)V

    .line 227
    .line 228
    .line 229
    const/4 v1, 0x3

    .line 230
    const/4 v2, 0x0

    .line 231
    invoke-static {v6, v2, v2, v0, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_3
    move-object/from16 v1, p0

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_4
    return-void
.end method

.method public final i()V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 10
    .line 11
    iget-object v2, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->f:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 12
    .line 13
    sget-object v3, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->ADD_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    :goto_0
    move/from16 v26, v2

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const/4 v2, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    :goto_1
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 29
    .line 30
    sget-object v22, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 31
    .line 32
    const v40, -0xdff8001

    .line 33
    .line 34
    .line 35
    const/16 v41, 0x1f

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    const/4 v13, 0x0

    .line 47
    const/4 v14, 0x0

    .line 48
    const/4 v15, 0x0

    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    const/16 v17, 0x0

    .line 52
    .line 53
    const/16 v18, 0x1

    .line 54
    .line 55
    const/16 v19, 0x0

    .line 56
    .line 57
    const/16 v20, 0x0

    .line 58
    .line 59
    const/16 v21, 0x0

    .line 60
    .line 61
    const/16 v23, 0x0

    .line 62
    .line 63
    const/16 v24, 0x0

    .line 64
    .line 65
    const/16 v25, 0x0

    .line 66
    .line 67
    const/16 v27, 0x1

    .line 68
    .line 69
    const/16 v28, 0x0

    .line 70
    .line 71
    const/16 v29, 0x0

    .line 72
    .line 73
    const/16 v31, 0x0

    .line 74
    .line 75
    const/16 v32, 0x0

    .line 76
    .line 77
    const/16 v33, 0x0

    .line 78
    .line 79
    const/16 v34, 0x0

    .line 80
    .line 81
    const/16 v35, 0x0

    .line 82
    .line 83
    const/16 v36, 0x0

    .line 84
    .line 85
    const/16 v37, 0x0

    .line 86
    .line 87
    const/16 v38, 0x0

    .line 88
    .line 89
    const/16 v39, 0x0

    .line 90
    .line 91
    move-object/from16 v30, v22

    .line 92
    .line 93
    invoke-static/range {v3 .. v41}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    return-void
.end method

.method public final j(Lcom/zykj/mistake/feature/collection/detail/m;)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$sendEffect$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$sendEffect$1;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lcom/zykj/mistake/feature/collection/detail/m;Lh6/c;)V

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
