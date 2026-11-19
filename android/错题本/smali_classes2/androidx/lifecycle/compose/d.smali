.class public final synthetic Landroidx/lifecycle/compose/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p5, p0, Landroidx/lifecycle/compose/d;->a:I

    iput-object p2, p0, Landroidx/lifecycle/compose/d;->d:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/lifecycle/compose/d;->e:Ljava/lang/Object;

    iput-object p6, p0, Landroidx/lifecycle/compose/d;->f:Ljava/lang/Object;

    iput p1, p0, Landroidx/lifecycle/compose/d;->b:I

    iput p3, p0, Landroidx/lifecycle/compose/d;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Landroidx/lifecycle/compose/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->d:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->e:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Ljava/util/List;

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->f:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Ljava/lang/String;

    .line 20
    .line 21
    move-object v4, p1

    .line 22
    check-cast v4, Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget p1, p0, Landroidx/lifecycle/compose/d;->b:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget v6, p0, Landroidx/lifecycle/compose/d;->c:I

    .line 38
    .line 39
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/main/drawer/g;->d(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->d:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    check-cast v1, Ljava/lang/String;

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->e:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v2, v0

    .line 53
    check-cast v2, Ljava/util/ArrayList;

    .line 54
    .line 55
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->f:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    check-cast v3, Ljava/lang/String;

    .line 59
    .line 60
    move-object v4, p1

    .line 61
    check-cast v4, Landroidx/compose/runtime/Composer;

    .line 62
    .line 63
    check-cast p2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget p1, p0, Landroidx/lifecycle/compose/d;->b:I

    .line 69
    .line 70
    or-int/lit8 p1, p1, 0x1

    .line 71
    .line 72
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    iget v6, p0, Landroidx/lifecycle/compose/d;->c:I

    .line 77
    .line 78
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/collection/filter/i;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_1
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->d:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v1, v0

    .line 87
    check-cast v1, Landroidx/navigation/NavHostController;

    .line 88
    .line 89
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->e:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v2, v0

    .line 92
    check-cast v2, Landroidx/navigation/NavGraph;

    .line 93
    .line 94
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->f:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v3, v0

    .line 97
    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 98
    .line 99
    move-object v6, p1

    .line 100
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 101
    .line 102
    check-cast p2, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    iget v4, p0, Landroidx/lifecycle/compose/d;->b:I

    .line 109
    .line 110
    iget v5, p0, Landroidx/lifecycle/compose/d;->c:I

    .line 111
    .line 112
    invoke-static/range {v1 .. v7}, Landroidx/navigation/compose/NavHostKt;->v(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ld6/s;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    :pswitch_2
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->d:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v1, v0

    .line 120
    check-cast v1, Landroidx/lifecycle/Lifecycle$Event;

    .line 121
    .line 122
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->e:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v2, v0

    .line 125
    check-cast v2, Landroidx/lifecycle/LifecycleOwner;

    .line 126
    .line 127
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->f:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v3, v0

    .line 130
    check-cast v3, Lr6/a;

    .line 131
    .line 132
    move-object v6, p1

    .line 133
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 134
    .line 135
    check-cast p2, Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    iget v4, p0, Landroidx/lifecycle/compose/d;->b:I

    .line 142
    .line 143
    iget v5, p0, Landroidx/lifecycle/compose/d;->c:I

    .line 144
    .line 145
    invoke-static/range {v1 .. v7}, Landroidx/lifecycle/compose/LifecycleEffectKt;->i(Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lr6/a;IILandroidx/compose/runtime/Composer;I)Ld6/s;

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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
