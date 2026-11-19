.class public final enum Landroidx/fragment/app/SpecialEffectsController$Operation$State;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/SpecialEffectsController$Operation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;,
        Landroidx/fragment/app/SpecialEffectsController$Operation$State$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/fragment/app/SpecialEffectsController$Operation$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/fragment/app/SpecialEffectsController$Operation$State;

.field public static final Companion:Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;

.field public static final enum GONE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

.field public static final enum INVISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

.field public static final enum REMOVED:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

.field public static final enum VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;


# direct methods
.method private static final synthetic $values()[Landroidx/fragment/app/SpecialEffectsController$Operation$State;
    .locals 4

    sget-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->REMOVED:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    sget-object v1, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    sget-object v2, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->GONE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    sget-object v3, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->INVISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    filled-new-array {v0, v1, v2, v3}, [Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 2
    .line 3
    const-string v1, "REMOVED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/SpecialEffectsController$Operation$State;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->REMOVED:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 10
    .line 11
    new-instance v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 12
    .line 13
    const-string v1, "VISIBLE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/SpecialEffectsController$Operation$State;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 20
    .line 21
    new-instance v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 22
    .line 23
    const-string v1, "GONE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/SpecialEffectsController$Operation$State;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->GONE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 30
    .line 31
    new-instance v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 32
    .line 33
    const-string v1, "INVISIBLE"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/SpecialEffectsController$Operation$State;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->INVISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 40
    .line 41
    invoke-static {}, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->$values()[Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->$VALUES:[Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 46
    .line 47
    new-instance v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, v1}, Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->Companion:Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;

    .line 54
    .line 55
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final from(I)Landroidx/fragment/app/SpecialEffectsController$Operation$State;
    .locals 1

    sget-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->Companion:Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;->from(I)Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/fragment/app/SpecialEffectsController$Operation$State;
    .locals 1

    const-class v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    return-object p0
.end method

.method public static values()[Landroidx/fragment/app/SpecialEffectsController$Operation$State;
    .locals 1

    sget-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->$VALUES:[Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    return-object v0
.end method


# virtual methods
.method public final applyState(Landroid/view/View;Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    const-string/jumbo v0, "view"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "container"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 14
    .line 15
    .line 16
    sget-object v1, Landroidx/fragment/app/SpecialEffectsController$Operation$State$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    aget v1, v1, v2

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eq v1, v2, :cond_9

    .line 27
    .line 28
    if-eq v1, v0, :cond_4

    .line 29
    .line 30
    const/4 p2, 0x3

    .line 31
    if-eq v1, p2, :cond_2

    .line 32
    .line 33
    const/4 p2, 0x4

    .line 34
    if-eq v1, p2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_3

    .line 55
    .line 56
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    :cond_3
    const/16 p2, 0x8

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_4
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 79
    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    move-object v3, v1

    .line 83
    check-cast v3, Landroid/view/ViewGroup;

    .line 84
    .line 85
    :cond_6
    if-nez v3, :cond_8

    .line 86
    .line 87
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_7

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    :cond_7
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    :cond_8
    const/4 p2, 0x0

    .line 103
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    instance-of v1, p2, Landroid/view/ViewGroup;

    .line 112
    .line 113
    if-eqz v1, :cond_a

    .line 114
    .line 115
    move-object v3, p2

    .line 116
    check-cast v3, Landroid/view/ViewGroup;

    .line 117
    .line 118
    :cond_a
    if-eqz v3, :cond_c

    .line 119
    .line 120
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eqz p2, :cond_b

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    :cond_b
    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    :cond_c
    :goto_0
    return-void
.end method
