.class public final Lcom/zykj/blackboard/core/data/dao/RecordEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/RecordEntity_$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Class;

.field public static final b:Lc8/b;

.field public static final c:Lcom/zykj/blackboard/core/data/dao/RecordEntity_$a;

.field public static final d:Lcom/zykj/blackboard/core/data/dao/RecordEntity_;

.field public static final e:Lio/objectbox/Property;

.field public static final f:Lio/objectbox/Property;

.field public static final g:[Lio/objectbox/Property;

.field public static final h:Lio/objectbox/Property;

.field public static final i:Lio/objectbox/relation/RelationInfo;

.field public static final j:Lio/objectbox/relation/RelationInfo;

.field public static final k:Lio/objectbox/relation/RelationInfo;

.field public static final l:Lio/objectbox/relation/RelationInfo;

.field public static final m:Lio/objectbox/relation/RelationInfo;

.field public static final n:Lio/objectbox/relation/RelationInfo;

.field public static final o:Lio/objectbox/relation/RelationInfo;

.field public static final p:Lio/objectbox/relation/RelationInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->a:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->b:Lc8/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$a;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity_$a;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/RecordEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->e:Lio/objectbox/Property;

    .line 42
    .line 43
    new-instance v1, Lio/objectbox/Property;

    .line 44
    .line 45
    const-string v6, "pageId"

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    const/4 v4, 0x2

    .line 49
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->f:Lio/objectbox/Property;

    .line 53
    .line 54
    filled-new-array {v0, v1}, [Lio/objectbox/Property;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sput-object v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->g:[Lio/objectbox/Property;

    .line 59
    .line 60
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->h:Lio/objectbox/Property;

    .line 61
    .line 62
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 63
    .line 64
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->d:Lcom/zykj/blackboard/core/data/dao/PageEntity_;

    .line 65
    .line 66
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$1;

    .line 67
    .line 68
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$1;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, v2, v3, v1, v4}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->i:Lio/objectbox/relation/RelationInfo;

    .line 75
    .line 76
    new-instance v1, Lio/objectbox/relation/RelationInfo;

    .line 77
    .line 78
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity_;

    .line 79
    .line 80
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$2;

    .line 81
    .line 82
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$2;-><init>()V

    .line 83
    .line 84
    .line 85
    sget-object v5, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity_;->h:Lio/objectbox/Property;

    .line 86
    .line 87
    new-instance v6, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$3;

    .line 88
    .line 89
    invoke-direct {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$3;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-direct/range {v1 .. v6}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 93
    .line 94
    .line 95
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->j:Lio/objectbox/relation/RelationInfo;

    .line 96
    .line 97
    new-instance v1, Lio/objectbox/relation/RelationInfo;

    .line 98
    .line 99
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;

    .line 100
    .line 101
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$4;

    .line 102
    .line 103
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$4;-><init>()V

    .line 104
    .line 105
    .line 106
    sget-object v5, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->h:Lio/objectbox/Property;

    .line 107
    .line 108
    new-instance v6, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$5;

    .line 109
    .line 110
    invoke-direct {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$5;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-direct/range {v1 .. v6}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 114
    .line 115
    .line 116
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->k:Lio/objectbox/relation/RelationInfo;

    .line 117
    .line 118
    new-instance v1, Lio/objectbox/relation/RelationInfo;

    .line 119
    .line 120
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;

    .line 121
    .line 122
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$6;

    .line 123
    .line 124
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$6;-><init>()V

    .line 125
    .line 126
    .line 127
    sget-object v5, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->h:Lio/objectbox/Property;

    .line 128
    .line 129
    new-instance v6, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$7;

    .line 130
    .line 131
    invoke-direct {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$7;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-direct/range {v1 .. v6}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 135
    .line 136
    .line 137
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->l:Lio/objectbox/relation/RelationInfo;

    .line 138
    .line 139
    new-instance v1, Lio/objectbox/relation/RelationInfo;

    .line 140
    .line 141
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity_;

    .line 142
    .line 143
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$8;

    .line 144
    .line 145
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$8;-><init>()V

    .line 146
    .line 147
    .line 148
    sget-object v5, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity_;->h:Lio/objectbox/Property;

    .line 149
    .line 150
    new-instance v6, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$9;

    .line 151
    .line 152
    invoke-direct {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$9;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-direct/range {v1 .. v6}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 156
    .line 157
    .line 158
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->m:Lio/objectbox/relation/RelationInfo;

    .line 159
    .line 160
    new-instance v1, Lio/objectbox/relation/RelationInfo;

    .line 161
    .line 162
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity_;

    .line 163
    .line 164
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$10;

    .line 165
    .line 166
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$10;-><init>()V

    .line 167
    .line 168
    .line 169
    sget-object v5, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity_;->h:Lio/objectbox/Property;

    .line 170
    .line 171
    new-instance v6, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$11;

    .line 172
    .line 173
    invoke-direct {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$11;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-direct/range {v1 .. v6}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 177
    .line 178
    .line 179
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->n:Lio/objectbox/relation/RelationInfo;

    .line 180
    .line 181
    new-instance v1, Lio/objectbox/relation/RelationInfo;

    .line 182
    .line 183
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;

    .line 184
    .line 185
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$12;

    .line 186
    .line 187
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$12;-><init>()V

    .line 188
    .line 189
    .line 190
    sget-object v5, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;->h:Lio/objectbox/Property;

    .line 191
    .line 192
    new-instance v6, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$13;

    .line 193
    .line 194
    invoke-direct {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$13;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-direct/range {v1 .. v6}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 198
    .line 199
    .line 200
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->o:Lio/objectbox/relation/RelationInfo;

    .line 201
    .line 202
    new-instance v1, Lio/objectbox/relation/RelationInfo;

    .line 203
    .line 204
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;

    .line 205
    .line 206
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$14;

    .line 207
    .line 208
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$14;-><init>()V

    .line 209
    .line 210
    .line 211
    sget-object v5, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->h:Lio/objectbox/Property;

    .line 212
    .line 213
    new-instance v6, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$15;

    .line 214
    .line 215
    invoke-direct {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$15;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-direct/range {v1 .. v6}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 219
    .line 220
    .line 221
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->p:Lio/objectbox/relation/RelationInfo;

    .line 222
    .line 223
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
.method public d()[Lio/objectbox/Property;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->g:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Lc8/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->b:Lc8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    return v0
.end method

.method public l()Lc8/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->c:Lcom/zykj/blackboard/core/data/dao/RecordEntity_$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RecordEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RecordEntity"

    .line 2
    .line 3
    return-object v0
.end method
