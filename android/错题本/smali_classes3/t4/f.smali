.class public final synthetic Lt4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/main/MainShellViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt4/f;->a:I

    iput-object p1, p0, Lt4/f;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lt4/f;->a:I

    .line 2
    .line 3
    check-cast p1, Landroidx/compose/animation/AnimatedContentScope;

    .line 4
    .line 5
    check-cast p2, Landroidx/navigation/NavBackStackEntry;

    .line 6
    .line 7
    check-cast p3, Landroidx/compose/runtime/Composer;

    .line 8
    .line 9
    check-cast p4, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    const-string v0, "$this$composable"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string p1, "entry"

    .line 24
    .line 25
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    const/4 p1, -0x1

    .line 35
    const-string v0, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:104)"

    .line 36
    .line 37
    const v1, 0xff89a24

    .line 38
    .line 39
    .line 40
    invoke-static {v1, p4, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    shr-int/lit8 p1, p4, 0x3

    .line 44
    .line 45
    and-int/lit8 p1, p1, 0xe

    .line 46
    .line 47
    iget-object p4, p0, Lt4/f;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 48
    .line 49
    invoke-static {p2, p4, p3, p1}, Lcom/zykj/mistake/feature/collection/filter/b;->a(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 59
    .line 60
    .line 61
    :cond_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 62
    .line 63
    return-object p1

    .line 64
    :pswitch_0
    const-string v0, "$this$composable"

    .line 65
    .line 66
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string p1, "entry"

    .line 70
    .line 71
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    const/4 p1, -0x1

    .line 81
    const-string v0, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:92)"

    .line 82
    .line 83
    const v1, 0x4a8fe405    # 4715010.5f

    .line 84
    .line 85
    .line 86
    invoke-static {v1, p4, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    shr-int/lit8 p1, p4, 0x3

    .line 90
    .line 91
    and-int/lit8 p1, p1, 0xe

    .line 92
    .line 93
    iget-object p4, p0, Lt4/f;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 94
    .line 95
    invoke-static {p2, p4, p3, p1}, Lcom/zykj/mistake/feature/collection/detail/e;->a(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 96
    .line 97
    .line 98
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_3

    .line 103
    .line 104
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 105
    .line 106
    .line 107
    :cond_3
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 108
    .line 109
    return-object p1

    .line 110
    :pswitch_1
    const-string v0, "$this$composable"

    .line 111
    .line 112
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const-string p1, "it"

    .line 116
    .line 117
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_4

    .line 125
    .line 126
    const/4 p1, -0x1

    .line 127
    const-string p2, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:82)"

    .line 128
    .line 129
    const v0, -0x55ab5705

    .line 130
    .line 131
    .line 132
    invoke-static {v0, p4, p1, p2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    const/4 p1, 0x0

    .line 136
    iget-object p2, p0, Lt4/f;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 137
    .line 138
    invoke-static {p2, p3, p1}, Lcom/zykj/mistake/feature/home/j;->a(Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_5

    .line 146
    .line 147
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 148
    .line 149
    .line 150
    :cond_5
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 151
    .line 152
    return-object p1

    .line 153
    :pswitch_2
    const-string v0, "$this$composable"

    .line 154
    .line 155
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const-string p1, "entry"

    .line 159
    .line 160
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_6

    .line 168
    .line 169
    const/4 p1, -0x1

    .line 170
    const-string v0, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:116)"

    .line 171
    .line 172
    const v1, -0x2a9eafbd

    .line 173
    .line 174
    .line 175
    invoke-static {v1, p4, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :cond_6
    shr-int/lit8 p1, p4, 0x3

    .line 179
    .line 180
    and-int/lit8 p1, p1, 0xe

    .line 181
    .line 182
    iget-object p4, p0, Lt4/f;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 183
    .line 184
    invoke-static {p2, p4, p3, p1}, Lcom/zykj/mistake/feature/notebook/detail/r4;->a(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 185
    .line 186
    .line 187
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_7

    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 194
    .line 195
    .line 196
    :cond_7
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 197
    .line 198
    return-object p1

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
