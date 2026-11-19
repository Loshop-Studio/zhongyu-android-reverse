.class public final synthetic Lcom/zykj/mistake/activity/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/activity/MainActivity;

.field public final synthetic b:Landroidx/navigation/NavHostController;

.field public final synthetic c:Lt4/e;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MainActivity;Landroidx/navigation/NavHostController;Lt4/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/activity/d;->a:Lcom/zykj/mistake/activity/MainActivity;

    iput-object p2, p0, Lcom/zykj/mistake/activity/d;->b:Landroidx/navigation/NavHostController;

    iput-object p3, p0, Lcom/zykj/mistake/activity/d;->c:Lt4/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sget p2, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 11
    .line 12
    and-int/lit8 p2, p1, 0x3

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    if-eq p2, v7, :cond_0

    .line 16
    .line 17
    const/4 p2, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p2, 0x0

    .line 20
    :goto_0
    and-int/lit8 v0, p1, 0x1

    .line 21
    .line 22
    invoke-interface {v4, p2, v0}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_6

    .line 27
    .line 28
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    const/4 p2, -0x1

    .line 35
    const-string v0, "com.zykj.mistake.activity.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:136)"

    .line 36
    .line 37
    const v1, 0x18354084

    .line 38
    .line 39
    .line 40
    invoke-static {v1, p1, p2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p1, p0, Lcom/zykj/mistake/activity/d;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 44
    .line 45
    iget-object p2, p1, Lcom/zykj/mistake/activity/MainActivity;->l:Lkotlinx/serialization/json/internal/l;

    .line 46
    .line 47
    iget-object p2, p2, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v0, p2

    .line 50
    check-cast v0, Lkotlinx/coroutines/flow/a0;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x7

    .line 54
    const/4 v1, 0x0

    .line 55
    const/4 v2, 0x0

    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-static/range {v0 .. v6}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/m0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p1}, Lcom/zykj/mistake/activity/MainActivity;->o()Lcom/zykj/mistake/main/MainShellViewModel;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v2, p1, Lcom/zykj/mistake/activity/MainActivity;->b:Lo2/a;

    .line 66
    .line 67
    invoke-interface {p2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    check-cast p2, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    iget-object p2, p0, Lcom/zykj/mistake/activity/d;->c:Lt4/e;

    .line 78
    .line 79
    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-nez v0, :cond_2

    .line 88
    .line 89
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-ne v5, v0, :cond_3

    .line 96
    .line 97
    :cond_2
    new-instance v5, Lcom/zykj/mistake/activity/MainActivity$onCreate$1$1$1$1;

    .line 98
    .line 99
    invoke-direct {v5, p2}, Lcom/zykj/mistake/activity/MainActivity$onCreate$1$1$1$1;-><init>(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    check-cast v5, Ly6/e;

    .line 106
    .line 107
    check-cast v5, Lr6/a;

    .line 108
    .line 109
    invoke-interface {v4, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-nez p2, :cond_4

    .line 118
    .line 119
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 120
    .line 121
    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    if-ne v0, p2, :cond_5

    .line 126
    .line 127
    :cond_4
    new-instance v0, Lcom/zykj/mistake/activity/f;

    .line 128
    .line 129
    invoke-direct {v0, p1, v7}, Lcom/zykj/mistake/activity/f;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_5
    check-cast v0, Lr6/a;

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    move-object v6, v4

    .line 139
    move-object v4, v5

    .line 140
    move-object v5, v0

    .line 141
    iget-object v0, p0, Lcom/zykj/mistake/activity/d;->b:Landroidx/navigation/NavHostController;

    .line 142
    .line 143
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/main/k;->a(Landroidx/navigation/NavHostController;Lcom/zykj/mistake/main/MainShellViewModel;Lo2/a;ZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 144
    .line 145
    .line 146
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_7

    .line 151
    .line 152
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 157
    .line 158
    .line 159
    :cond_7
    :goto_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 160
    .line 161
    return-object p1
.end method
