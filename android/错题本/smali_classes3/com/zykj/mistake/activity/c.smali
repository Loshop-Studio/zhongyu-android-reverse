.class public final synthetic Lcom/zykj/mistake/activity/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/c;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/c;->b:Lcom/zykj/mistake/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/c;->a:I

    .line 2
    .line 3
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/String;

    .line 11
    .line 12
    sget v0, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 13
    .line 14
    const-string v0, "startTime"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "endTime"

    .line 20
    .line 21
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/mistake/activity/c;->b:Lcom/zykj/mistake/activity/MainActivity;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/mistake/activity/MainActivity;->o()Lcom/zykj/mistake/main/MainShellViewModel;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v2, Lcom/zykj/mistake/main/f0;

    .line 31
    .line 32
    invoke-direct {v2, p1, p2}, Lcom/zykj/mistake/main/f0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_0
    move-object v7, p1

    .line 40
    check-cast v7, Landroidx/compose/runtime/Composer;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    sget p2, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 49
    .line 50
    and-int/lit8 p2, p1, 0x3

    .line 51
    .line 52
    const/4 v0, 0x2

    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x1

    .line 55
    if-eq p2, v0, :cond_0

    .line 56
    .line 57
    move p2, v3

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move p2, v2

    .line 60
    :goto_0
    and-int/lit8 v0, p1, 0x1

    .line 61
    .line 62
    invoke-interface {v7, p2, v0}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_5

    .line 67
    .line 68
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_1

    .line 73
    .line 74
    const/4 p2, -0x1

    .line 75
    const-string v0, "com.zykj.mistake.activity.MainActivity.onCreate.<anonymous> (MainActivity.kt:129)"

    .line 76
    .line 77
    const v4, 0x62cdf6d6

    .line 78
    .line 79
    .line 80
    invoke-static {v4, p1, p2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    new-array p1, v2, [Landroidx/navigation/Navigator;

    .line 84
    .line 85
    invoke-static {p1, v7, v2}, Landroidx/navigation/compose/NavHostControllerKt;->rememberNavController([Landroidx/navigation/Navigator;Landroidx/compose/runtime/Composer;I)Landroidx/navigation/NavHostController;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {v7, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-nez p2, :cond_2

    .line 98
    .line 99
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 100
    .line 101
    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    if-ne v0, p2, :cond_3

    .line 106
    .line 107
    :cond_2
    new-instance v0, Lt4/e;

    .line 108
    .line 109
    invoke-direct {v0, p1}, Lt4/e;-><init>(Landroidx/navigation/NavHostController;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    move-object v5, v0

    .line 116
    check-cast v5, Lt4/e;

    .line 117
    .line 118
    move p2, v3

    .line 119
    iget-object v3, p0, Lcom/zykj/mistake/activity/c;->b:Lcom/zykj/mistake/activity/MainActivity;

    .line 120
    .line 121
    iget-object v4, v3, Lcom/zykj/mistake/activity/MainActivity;->m:Lw4/a;

    .line 122
    .line 123
    if-eqz v4, :cond_4

    .line 124
    .line 125
    new-instance v0, Lcom/zykj/mistake/activity/d;

    .line 126
    .line 127
    invoke-direct {v0, v3, p1, v5}, Lcom/zykj/mistake/activity/d;-><init>(Lcom/zykj/mistake/activity/MainActivity;Landroidx/navigation/NavHostController;Lt4/e;)V

    .line 128
    .line 129
    .line 130
    const/16 p1, 0x36

    .line 131
    .line 132
    const v2, 0x18354084

    .line 133
    .line 134
    .line 135
    invoke-static {v2, p2, v0, v7, p1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    const/16 v8, 0xc00

    .line 140
    .line 141
    invoke-static/range {v3 .. v8}, Ly1/a;->b(Lw4/c;Lw4/a;Lt4/e;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 142
    .line 143
    .line 144
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_6

    .line 149
    .line 150
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_4
    const-string p1, "routeInfrastructure"

    .line 155
    .line 156
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const/4 p1, 0x0

    .line 160
    throw p1

    .line 161
    :cond_5
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 162
    .line 163
    .line 164
    :cond_6
    :goto_1
    return-object v1

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
