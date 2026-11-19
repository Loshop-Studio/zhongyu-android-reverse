.class public final Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/Class;

.field public static final d:Lkc/b;

.field public static final e:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;

.field public static final f:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;

.field public static final g:Lio/objectbox/Property;

.field public static final h:Lio/objectbox/Property;

.field public static final i:Lio/objectbox/Property;

.field public static final j:Lio/objectbox/Property;

.field public static final k:Lio/objectbox/Property;

.field public static final l:Lio/objectbox/Property;

.field public static final m:Lio/objectbox/Property;

.field public static final n:[Lio/objectbox/Property;

.field public static final o:Lio/objectbox/Property;

.field public static final p:Lio/objectbox/relation/RelationInfo;

.field public static final q:Lio/objectbox/relation/RelationInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->c:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->d:Lkc/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->e:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->f:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;

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
    move-object v7, v5

    .line 42
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->g:Lio/objectbox/Property;

    .line 43
    .line 44
    new-instance v1, Lio/objectbox/Property;

    .line 45
    .line 46
    const-string v6, "width"

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    const/4 v4, 0x2

    .line 50
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object v8, v1

    .line 56
    move-object v9, v5

    .line 57
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->h:Lio/objectbox/Property;

    .line 58
    .line 59
    new-instance v1, Lio/objectbox/Property;

    .line 60
    .line 61
    const-string v6, "color"

    .line 62
    .line 63
    const/4 v3, 0x2

    .line 64
    const/4 v4, 0x3

    .line 65
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v10, v1

    .line 71
    move-object v11, v5

    .line 72
    sput-object v10, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->i:Lio/objectbox/Property;

    .line 73
    .line 74
    new-instance v1, Lio/objectbox/Property;

    .line 75
    .line 76
    const/4 v4, 0x4

    .line 77
    const-string v6, "textSize"

    .line 78
    .line 79
    const/4 v3, 0x3

    .line 80
    move-object v5, v9

    .line 81
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    move-object v9, v1

    .line 85
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->j:Lio/objectbox/Property;

    .line 86
    .line 87
    new-instance v1, Lio/objectbox/Property;

    .line 88
    .line 89
    const/4 v4, 0x5

    .line 90
    const-string v6, "style"

    .line 91
    .line 92
    const/4 v3, 0x4

    .line 93
    move-object v5, v11

    .line 94
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v11, v1

    .line 98
    sput-object v11, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->k:Lio/objectbox/Property;

    .line 99
    .line 100
    new-instance v1, Lio/objectbox/Property;

    .line 101
    .line 102
    const/4 v4, 0x6

    .line 103
    const-string v6, "geometryType"

    .line 104
    .line 105
    const/4 v3, 0x5

    .line 106
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    move-object v12, v8

    .line 110
    move-object v8, v1

    .line 111
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->l:Lio/objectbox/Property;

    .line 112
    .line 113
    new-instance v1, Lio/objectbox/Property;

    .line 114
    .line 115
    const-string v6, "recordId"

    .line 116
    .line 117
    move-object v5, v7

    .line 118
    const/4 v7, 0x1

    .line 119
    const/4 v3, 0x6

    .line 120
    const/4 v4, 0x7

    .line 121
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->m:Lio/objectbox/Property;

    .line 125
    .line 126
    move-object v3, v0

    .line 127
    move-object v6, v9

    .line 128
    move-object v5, v10

    .line 129
    move-object v7, v11

    .line 130
    move-object v4, v12

    .line 131
    move-object v9, v1

    .line 132
    filled-new-array/range {v3 .. v9}, [Lio/objectbox/Property;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    move-object v1, v3

    .line 137
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->n:[Lio/objectbox/Property;

    .line 138
    .line 139
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->o:Lio/objectbox/Property;

    .line 140
    .line 141
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 142
    .line 143
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->f:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;

    .line 144
    .line 145
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$1;

    .line 146
    .line 147
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$1;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-direct {v0, v2, v1, v9, v3}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 151
    .line 152
    .line 153
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->p:Lio/objectbox/relation/RelationInfo;

    .line 154
    .line 155
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 156
    .line 157
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->f:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;

    .line 158
    .line 159
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$2;

    .line 160
    .line 161
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$2;-><init>()V

    .line 162
    .line 163
    .line 164
    const/16 v4, 0xa

    .line 165
    .line 166
    invoke-direct {v0, v2, v1, v3, v4}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;I)V

    .line 167
    .line 168
    .line 169
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->q:Lio/objectbox/relation/RelationInfo;

    .line 170
    .line 171
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
.method public B()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "GeometryInfoEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public h()[Lio/objectbox/Property;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->n:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->c:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Lkc/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->d:Lkc/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()I
    .locals 1

    .line 1
    const/16 v0, 0x15

    return v0
.end method

.method public s()Lkc/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->e:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "GeometryInfoEntity"

    .line 2
    .line 3
    return-object v0
.end method
