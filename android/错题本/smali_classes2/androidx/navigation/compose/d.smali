.class public final synthetic Landroidx/navigation/compose/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/navigation/compose/d;->a:I

    iput-object p1, p0, Landroidx/navigation/compose/d;->c:Ljava/lang/Object;

    iput p2, p0, Landroidx/navigation/compose/d;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/navigation/compose/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/navigation/compose/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr6/e;

    .line 9
    .line 10
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    iget p2, p0, Landroidx/navigation/compose/d;->b:I

    .line 18
    .line 19
    or-int/lit8 p2, p2, 0x1

    .line 20
    .line 21
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-static {p1, p2, v0}, Lv7/d;->a(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_0
    iget-object v0, p0, Landroidx/navigation/compose/d;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 34
    .line 35
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    iget p2, p0, Landroidx/navigation/compose/d;->b:I

    .line 43
    .line 44
    or-int/lit8 p2, p2, 0x1

    .line 45
    .line 46
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-static {v0, p1, p2}, Lcom/zykj/mistake/feature/review/j;->a(Lcom/zykj/mistake/feature/review/ReviewViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 51
    .line 52
    .line 53
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 54
    .line 55
    return-object p1

    .line 56
    :pswitch_1
    iget-object v0, p0, Landroidx/navigation/compose/d;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 59
    .line 60
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 61
    .line 62
    check-cast p2, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    iget p2, p0, Landroidx/navigation/compose/d;->b:I

    .line 68
    .line 69
    or-int/lit8 p2, p2, 0x1

    .line 70
    .line 71
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-static {v0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/f1;->b(Lcom/zykj/mistake/feature/collection/detail/z0;Landroidx/compose/runtime/Composer;I)V

    .line 76
    .line 77
    .line 78
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_2
    iget-object v0, p0, Landroidx/navigation/compose/d;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lcom/zykj/mistake/feature/ask/n;

    .line 84
    .line 85
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    iget p2, p0, Landroidx/navigation/compose/d;->b:I

    .line 93
    .line 94
    or-int/lit8 p2, p2, 0x1

    .line 95
    .line 96
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-static {v0, p1, p2}, Lcom/zykj/mistake/feature/ask/o0;->g(Lcom/zykj/mistake/feature/ask/n;Landroidx/compose/runtime/Composer;I)V

    .line 101
    .line 102
    .line 103
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 104
    .line 105
    return-object p1

    .line 106
    :pswitch_3
    iget-object v0, p0, Landroidx/navigation/compose/d;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Landroidx/navigation/NavBackStackEntry;

    .line 109
    .line 110
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 111
    .line 112
    check-cast p2, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    iget p2, p0, Landroidx/navigation/compose/d;->b:I

    .line 118
    .line 119
    or-int/lit8 p2, p2, 0x1

    .line 120
    .line 121
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    invoke-static {v0, p1, p2}, Lcom/zykj/mistake/feature/ask/c;->a(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V

    .line 126
    .line 127
    .line 128
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 129
    .line 130
    return-object p1

    .line 131
    :pswitch_4
    iget-object v0, p0, Landroidx/navigation/compose/d;->c:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Landroidx/navigation/compose/DialogNavigator;

    .line 134
    .line 135
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 136
    .line 137
    check-cast p2, Ljava/lang/Integer;

    .line 138
    .line 139
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    iget v1, p0, Landroidx/navigation/compose/d;->b:I

    .line 144
    .line 145
    invoke-static {v0, v1, p1, p2}, Landroidx/navigation/compose/DialogHostKt;->b(Landroidx/navigation/compose/DialogNavigator;ILandroidx/compose/runtime/Composer;I)Ld6/s;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    return-object p1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
