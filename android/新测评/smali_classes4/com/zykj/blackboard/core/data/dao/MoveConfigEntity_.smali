.class public final Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Class;

.field public static final b:Lr8/b;

.field public static final c:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;

.field public static final d:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;

.field public static final e:Lio/objectbox/Property;

.field public static final f:Lio/objectbox/Property;

.field public static final g:Lio/objectbox/Property;

.field public static final h:Lio/objectbox/Property;

.field public static final i:Lio/objectbox/Property;

.field public static final j:Lio/objectbox/Property;

.field public static final k:Lio/objectbox/Property;

.field public static final l:Lio/objectbox/Property;

.field public static final m:[Lio/objectbox/Property;

.field public static final n:Lio/objectbox/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->a:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->b:Lr8/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->c:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->d:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;

    .line 25
    .line 26
    new-instance v1, Lio/objectbox/Property;

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    const-string v8, "id"

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    const-string v6, "id"

    .line 36
    .line 37
    invoke-direct/range {v1 .. v8}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v1

    .line 41
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->e:Lio/objectbox/Property;

    .line 42
    .line 43
    new-instance v1, Lio/objectbox/Property;

    .line 44
    .line 45
    const-string v6, "isEnable"

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    const/4 v4, 0x2

    .line 49
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object v7, v1

    .line 55
    sput-object v7, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->f:Lio/objectbox/Property;

    .line 56
    .line 57
    new-instance v1, Lio/objectbox/Property;

    .line 58
    .line 59
    const/4 v4, 0x3

    .line 60
    const-string v6, "verticalTranslate"

    .line 61
    .line 62
    const/4 v3, 0x2

    .line 63
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    move-object v8, v1

    .line 67
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->g:Lio/objectbox/Property;

    .line 68
    .line 69
    new-instance v1, Lio/objectbox/Property;

    .line 70
    .line 71
    const/4 v4, 0x4

    .line 72
    const-string v6, "horizontalTranslate"

    .line 73
    .line 74
    const/4 v3, 0x3

    .line 75
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    move-object v9, v1

    .line 79
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->h:Lio/objectbox/Property;

    .line 80
    .line 81
    new-instance v1, Lio/objectbox/Property;

    .line 82
    .line 83
    const/4 v4, 0x5

    .line 84
    const-string v6, "scale"

    .line 85
    .line 86
    const/4 v3, 0x4

    .line 87
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    move-object v10, v7

    .line 91
    move-object v7, v1

    .line 92
    sput-object v7, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->i:Lio/objectbox/Property;

    .line 93
    .line 94
    new-instance v1, Lio/objectbox/Property;

    .line 95
    .line 96
    const/4 v4, 0x6

    .line 97
    const-string v6, "rotate"

    .line 98
    .line 99
    const/4 v3, 0x5

    .line 100
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    move-object v11, v8

    .line 104
    move-object v8, v1

    .line 105
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->j:Lio/objectbox/Property;

    .line 106
    .line 107
    new-instance v1, Lio/objectbox/Property;

    .line 108
    .line 109
    const-string v6, "maxHeightTimes"

    .line 110
    .line 111
    const/4 v3, 0x6

    .line 112
    const/4 v4, 0x7

    .line 113
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 114
    .line 115
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    move-object v12, v9

    .line 119
    move-object v9, v1

    .line 120
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->k:Lio/objectbox/Property;

    .line 121
    .line 122
    new-instance v1, Lio/objectbox/Property;

    .line 123
    .line 124
    const/16 v4, 0x8

    .line 125
    .line 126
    const-string v6, "maxWidthTimes"

    .line 127
    .line 128
    const/4 v3, 0x7

    .line 129
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->l:Lio/objectbox/Property;

    .line 133
    .line 134
    move-object v3, v0

    .line 135
    move-object v4, v10

    .line 136
    move-object v5, v11

    .line 137
    move-object v6, v12

    .line 138
    move-object v10, v1

    .line 139
    filled-new-array/range {v3 .. v10}, [Lio/objectbox/Property;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    move-object v1, v3

    .line 144
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->m:[Lio/objectbox/Property;

    .line 145
    .line 146
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->n:Lio/objectbox/Property;

    .line 147
    .line 148
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c()[Lio/objectbox/Property;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->m:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Lr8/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->b:Lr8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()I
    .locals 1

    .line 1
    const/16 v0, 0x14

    return v0
.end method

.method public i()Lr8/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->c:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MoveConfigEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MoveConfigEntity"

    .line 2
    .line 3
    return-object v0
.end method
