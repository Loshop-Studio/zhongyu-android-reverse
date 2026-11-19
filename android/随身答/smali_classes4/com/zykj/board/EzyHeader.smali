# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public abstract Lcom/zykj/board/EzyHeader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyHeader$Author;,
        Lcom/zykj/board/EzyHeader$BackgroundLineConfig;,
        Lcom/zykj/board/EzyHeader$MoveConfig;,
        Lcom/zykj/board/EzyHeader$Header;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final c:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final e:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final g:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static i:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    const-string v0, "\n\u000cHeader.proto\u001a\u0010PageRouter.proto\u001a\"enums/BackgroundLineTypeEnum.proto\"\u008d\u0003\n\u0006Header\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0012\n\ncreateDate\u0018\u0004 \u0001(\u0003\u0012\u0012\n\nupdateDate\u0018\u0005 \u0001(\u0003\u0012\u0010\n\u0008duration\u0018\u0006 \u0001(\u0003\u0012\u0017\n\u0006author\u0018\u0007 \u0001(\u000b2\u0007.Author\u0012\u0012\n\nconvertUrl\u0018\u0008 \u0001(\t\u0012\u0019\n\u0008provider\u0018\t \u0003(\u000b2\u0007.Author\u0012\u001e\n\u0016defaultBackgroundColor\u0018\n \u0001(\u0005\u0012\u001b\n\u0013lastBackgroundColor\u0018\u000b \u0001(\u0005\u0012\u001f\n\nmoveConfig\u0018\u000c \u0001(\u000b2\u000b.MoveConfig\u0012:\n\u001bdefaultBackgroundLineConfig\u0018\r \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u000e \u0001(\u000b2\u0015.BackgroundLineConfig\"\u00a4\u0001\n\nMoveConfig\u0012\u0010\n\u0008isEnable\u0018\u0001 \u0001(\u0008\u0012\u0019\n\u0011verticalTranslate\u0018\u0002 \u0001(\u0008\u0012\u001b\n\u0013horizontalTranslate\u0018\u0003 \u0001(\u0008\u0012\r\n\u0005scale\u0018\u0004 \u0001(\u0008\u0012\u000e\n\u0006rotate\u0018\u0005 \u0001(\u0008\u0012\u0016\n\u000emaxHeightTimes\u0018\u0006 \u0001(\u0005\u0012\u0015\n\rmaxWidthTimes\u0018\u0007 \u0001(\u0005\"z\n\u0014BackgroundLineConfig\u0012\u0011\n\tlineColor\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tlineSpace\u0018\u0002 \u0001(\u0002\u0012)\n\u0008lineType\u0018\u0003 \u0001(\u000e2\u0017.BackgroundLineTypeEnum\u0012\u0011\n\tlineWidth\u0018\u0004 \u0001(\u0002\"r\n\u0006Author\u0012\u0012\n\nauthorName\u0018\u0001 \u0001(\t\u0012\u0010\n\u0008schoolId\u0018\u0002 \u0001(\t\u0012\u0010\n\u0008authorId\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003url\u0018\u0004 \u0001(\t\u0012\u0011\n\tstartTime\u0018\u0005 \u0001(\u0003\u0012\u0010\n\u0008duration\u0018\u0006 \u0001(\u0003B\u001b\n\u000ecom.zykj.boardB\tEzyHeaderb\u0006proto3"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lcom/zykj/board/EzyPageRouter;->e()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Lcom/zykj/board/EzyBackgroundLineTypeEnum;->a()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    filled-new-array {v1, v2}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/zykj/board/EzyHeader;->i:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 24
    .line 25
    invoke-static {}, Lcom/zykj/board/EzyHeader;->i()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 39
    .line 40
    sput-object v0, Lcom/zykj/board/EzyHeader;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 41
    .line 42
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 43
    .line 44
    const-string v14, "DefaultBackgroundLineConfig"

    .line 45
    .line 46
    const-string v15, "LastBackgroundLineConfig"

    .line 47
    .line 48
    const-string v2, "Version"

    .line 49
    .line 50
    const-string v3, "Width"

    .line 51
    .line 52
    const-string v4, "Height"

    .line 53
    .line 54
    const-string v5, "CreateDate"

    .line 55
    .line 56
    const-string v6, "UpdateDate"

    .line 57
    .line 58
    const-string v7, "Duration"

    .line 59
    .line 60
    const-string v8, "Author"

    .line 61
    .line 62
    const-string v9, "ConvertUrl"

    .line 63
    .line 64
    const-string v10, "Provider"

    .line 65
    .line 66
    const-string v11, "DefaultBackgroundColor"

    .line 67
    .line 68
    const-string v12, "LastBackgroundColor"

    .line 69
    .line 70
    const-string v13, "MoveConfig"

    .line 71
    .line 72
    filled-new-array/range {v2 .. v15}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sput-object v1, Lcom/zykj/board/EzyHeader;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 80
    .line 81
    invoke-static {}, Lcom/zykj/board/EzyHeader;->i()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v1, 0x1

    .line 90
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 95
    .line 96
    sput-object v0, Lcom/zykj/board/EzyHeader;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 97
    .line 98
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 99
    .line 100
    const-string v7, "MaxHeightTimes"

    .line 101
    .line 102
    const-string v8, "MaxWidthTimes"

    .line 103
    .line 104
    const-string v2, "IsEnable"

    .line 105
    .line 106
    const-string v3, "VerticalTranslate"

    .line 107
    .line 108
    const-string v4, "HorizontalTranslate"

    .line 109
    .line 110
    const-string v5, "Scale"

    .line 111
    .line 112
    const-string v6, "Rotate"

    .line 113
    .line 114
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sput-object v1, Lcom/zykj/board/EzyHeader;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 122
    .line 123
    invoke-static {}, Lcom/zykj/board/EzyHeader;->i()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const/4 v1, 0x2

    .line 132
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 137
    .line 138
    sput-object v0, Lcom/zykj/board/EzyHeader;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 139
    .line 140
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 141
    .line 142
    const-string v2, "LineType"

    .line 143
    .line 144
    const-string v3, "LineWidth"

    .line 145
    .line 146
    const-string v4, "LineColor"

    .line 147
    .line 148
    const-string v5, "LineSpace"

    .line 149
    .line 150
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    sput-object v1, Lcom/zykj/board/EzyHeader;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 158
    .line 159
    invoke-static {}, Lcom/zykj/board/EzyHeader;->i()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    const/4 v1, 0x3

    .line 168
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 173
    .line 174
    sput-object v0, Lcom/zykj/board/EzyHeader;->g:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 175
    .line 176
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 177
    .line 178
    const-string v6, "StartTime"

    .line 179
    .line 180
    const-string v7, "Duration"

    .line 181
    .line 182
    const-string v2, "AuthorName"

    .line 183
    .line 184
    const-string v3, "SchoolId"

    .line 185
    .line 186
    const-string v4, "AuthorId"

    .line 187
    .line 188
    const-string v5, "Url"

    .line 189
    .line 190
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    sput-object v1, Lcom/zykj/board/EzyHeader;->h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 198
    .line 199
    invoke-static {}, Lcom/zykj/board/EzyPageRouter;->e()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 200
    .line 201
    .line 202
    invoke-static {}, Lcom/zykj/board/EzyBackgroundLineTypeEnum;->a()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public static synthetic a()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic c()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic d()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic e()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic f()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic g()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader;->g:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic h()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader;->h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static i()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader;->i:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method
