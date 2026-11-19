.class public abstract Lb4/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final c:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final e:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final g:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final i:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 17

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
    sget-object v1, Lb4/j0;->e:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 8
    .line 9
    sget-object v2, Lb4/b;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 10
    .line 11
    filled-new-array {v1, v2}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lb4/y;->i:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 31
    .line 32
    sput-object v1, Lb4/y;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 33
    .line 34
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 35
    .line 36
    const-string v15, "DefaultBackgroundLineConfig"

    .line 37
    .line 38
    const-string v16, "LastBackgroundLineConfig"

    .line 39
    .line 40
    const-string v3, "Version"

    .line 41
    .line 42
    const-string v4, "Width"

    .line 43
    .line 44
    const-string v5, "Height"

    .line 45
    .line 46
    const-string v6, "CreateDate"

    .line 47
    .line 48
    const-string v7, "UpdateDate"

    .line 49
    .line 50
    const-string v8, "Duration"

    .line 51
    .line 52
    const-string v9, "Author"

    .line 53
    .line 54
    const-string v10, "ConvertUrl"

    .line 55
    .line 56
    const-string v11, "Provider"

    .line 57
    .line 58
    const-string v12, "DefaultBackgroundColor"

    .line 59
    .line 60
    const-string v13, "LastBackgroundColor"

    .line 61
    .line 62
    const-string v14, "MoveConfig"

    .line 63
    .line 64
    filled-new-array/range {v3 .. v16}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v2, Lb4/y;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const/4 v2, 0x1

    .line 78
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 83
    .line 84
    sput-object v1, Lb4/y;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 85
    .line 86
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 87
    .line 88
    const-string v8, "MaxHeightTimes"

    .line 89
    .line 90
    const-string v9, "MaxWidthTimes"

    .line 91
    .line 92
    const-string v3, "IsEnable"

    .line 93
    .line 94
    const-string v4, "VerticalTranslate"

    .line 95
    .line 96
    const-string v5, "HorizontalTranslate"

    .line 97
    .line 98
    const-string v6, "Scale"

    .line 99
    .line 100
    const-string v7, "Rotate"

    .line 101
    .line 102
    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    sput-object v2, Lb4/y;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 110
    .line 111
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const/4 v2, 0x2

    .line 116
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 121
    .line 122
    sput-object v1, Lb4/y;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 123
    .line 124
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 125
    .line 126
    const-string v3, "LineType"

    .line 127
    .line 128
    const-string v4, "LineWidth"

    .line 129
    .line 130
    const-string v5, "LineColor"

    .line 131
    .line 132
    const-string v6, "LineSpace"

    .line 133
    .line 134
    filled-new-array {v5, v6, v3, v4}, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    sput-object v2, Lb4/y;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const/4 v1, 0x3

    .line 148
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 153
    .line 154
    sput-object v0, Lb4/y;->g:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 155
    .line 156
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 157
    .line 158
    const-string v6, "StartTime"

    .line 159
    .line 160
    const-string v7, "Duration"

    .line 161
    .line 162
    const-string v2, "AuthorName"

    .line 163
    .line 164
    const-string v3, "SchoolId"

    .line 165
    .line 166
    const-string v4, "AuthorId"

    .line 167
    .line 168
    const-string v5, "Url"

    .line 169
    .line 170
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    sput-object v1, Lb4/y;->h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 178
    .line 179
    return-void
.end method
