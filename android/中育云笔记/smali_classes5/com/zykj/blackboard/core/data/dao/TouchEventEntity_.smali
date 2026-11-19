.class public final Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/Class;

.field public static final d:Lkc/b;

.field public static final e:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;

.field public static final f:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;

.field public static final g:Lio/objectbox/Property;

.field public static final h:Lio/objectbox/Property;

.field public static final i:Lio/objectbox/Property;

.field public static final j:Lio/objectbox/Property;

.field public static final k:Lio/objectbox/Property;

.field public static final l:Lio/objectbox/Property;

.field public static final m:Lio/objectbox/Property;

.field public static final n:Lio/objectbox/Property;

.field public static final o:[Lio/objectbox/Property;

.field public static final p:Lio/objectbox/Property;

.field public static final q:Lio/objectbox/relation/RelationInfo;

.field public static final r:Lio/objectbox/relation/RelationInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->c:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->d:Lkc/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->e:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->f:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->g:Lio/objectbox/Property;

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
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->h:Lio/objectbox/Property;

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
    sput-object v10, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->i:Lio/objectbox/Property;

    .line 73
    .line 74
    new-instance v1, Lio/objectbox/Property;

    .line 75
    .line 76
    const/4 v4, 0x4

    .line 77
    const-string v6, "spacing"

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
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->j:Lio/objectbox/Property;

    .line 86
    .line 87
    new-instance v1, Lio/objectbox/Property;

    .line 88
    .line 89
    const/4 v4, 0x5

    .line 90
    const-string v6, "itemLength"

    .line 91
    .line 92
    const/4 v3, 0x4

    .line 93
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    move-object v12, v1

    .line 97
    move-object v13, v5

    .line 98
    sput-object v12, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->k:Lio/objectbox/Property;

    .line 99
    .line 100
    new-instance v1, Lio/objectbox/Property;

    .line 101
    .line 102
    const/4 v4, 0x6

    .line 103
    const-string v6, "style"

    .line 104
    .line 105
    const/4 v3, 0x5

    .line 106
    move-object v5, v11

    .line 107
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    move-object v11, v8

    .line 111
    move-object v8, v1

    .line 112
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->l:Lio/objectbox/Property;

    .line 113
    .line 114
    new-instance v1, Lio/objectbox/Property;

    .line 115
    .line 116
    const/4 v4, 0x7

    .line 117
    const-string v6, "textSize"

    .line 118
    .line 119
    const/4 v3, 0x6

    .line 120
    move-object v5, v13

    .line 121
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    move-object v13, v9

    .line 125
    move-object v9, v1

    .line 126
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->m:Lio/objectbox/Property;

    .line 127
    .line 128
    new-instance v1, Lio/objectbox/Property;

    .line 129
    .line 130
    const-string v6, "recordId"

    .line 131
    .line 132
    move-object v5, v7

    .line 133
    const/4 v7, 0x1

    .line 134
    const/4 v3, 0x7

    .line 135
    const/16 v4, 0x8

    .line 136
    .line 137
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 138
    .line 139
    .line 140
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->n:Lio/objectbox/Property;

    .line 141
    .line 142
    move-object v3, v0

    .line 143
    move-object v5, v10

    .line 144
    move-object v4, v11

    .line 145
    move-object v7, v12

    .line 146
    move-object v6, v13

    .line 147
    move-object v10, v1

    .line 148
    filled-new-array/range {v3 .. v10}, [Lio/objectbox/Property;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    move-object v1, v3

    .line 153
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->o:[Lio/objectbox/Property;

    .line 154
    .line 155
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->p:Lio/objectbox/Property;

    .line 156
    .line 157
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 158
    .line 159
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->f:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;

    .line 160
    .line 161
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$1;

    .line 162
    .line 163
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$1;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-direct {v0, v2, v1, v10, v3}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 167
    .line 168
    .line 169
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->q:Lio/objectbox/relation/RelationInfo;

    .line 170
    .line 171
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 172
    .line 173
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->f:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;

    .line 174
    .line 175
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$2;

    .line 176
    .line 177
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$2;-><init>()V

    .line 178
    .line 179
    .line 180
    const/4 v4, 0x7

    .line 181
    invoke-direct {v0, v2, v1, v3, v4}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;I)V

    .line 182
    .line 183
    .line 184
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->r:Lio/objectbox/relation/RelationInfo;

    .line 185
    .line 186
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
    const-string v0, "TouchEventEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public h()[Lio/objectbox/Property;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->o:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->c:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Lkc/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->d:Lkc/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()I
    .locals 1

    .line 1
    const/4 v0, 0x4

    return v0
.end method

.method public s()Lkc/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->e:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TouchEventEntity"

    .line 2
    .line 3
    return-object v0
.end method
