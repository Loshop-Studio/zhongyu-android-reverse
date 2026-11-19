.class public final Lcom/friday/lecture/model/ClassTestHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

.field private static demonstratingList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;>;"
        }
    .end annotation
.end field

.field private static fullscreenMember:Ljava/lang/String;

.field private static final onlineList:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final privateOnlineList:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/List<",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;>;"
        }
    .end annotation
.end field

.field private static randomlySelectedMember:Ljava/lang/String;

.field private static recentlyHomework:Lcom/friday/common/classtest/MqttResponse;

.field private static selectedList:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final submittedStudentList:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/lecture/model/ClassTestHelper;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/lecture/model/ClassTestHelper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/friday/lecture/model/ClassTestHelper;->defaultSelectedList()Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sput-object v1, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/friday/lecture/model/ClassTestHelper;->defaultDemonstratingList()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 19
    .line 20
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->privateOnlineList:Landroidx/lifecycle/MutableLiveData;

    .line 30
    .line 31
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->onlineList:Landroidx/lifecycle/LiveData;

    .line 32
    .line 33
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->submittedStudentList:Ljava/util/LinkedHashSet;

    .line 39
    .line 40
    const/16 v0, 0x8

    .line 41
    .line 42
    sput v0, Lcom/friday/lecture/model/ClassTestHelper;->$stable:I

    .line 43
    .line 44
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lcom/friday/common/classtest/MqttResponse$Student;Lcom/friday/common/classtest/MqttResponse$Student;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/model/ClassTestHelper;->setStudentList$lambda$4(Lcom/friday/common/classtest/MqttResponse$Student;Lcom/friday/common/classtest/MqttResponse$Student;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/lecture/model/ClassTestHelper;->setStudentList$lambda$5(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private final defaultDemonstratingList()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/Pair;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    new-instance v2, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 6
    .line 7
    sget-object v3, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {v3}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Lcom/friday/common/helper/b;->u()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-direct {p0}, Lcom/friday/lecture/model/ClassTestHelper;->getUserId()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-direct {v2, v3, v4}, Lcom/friday/common/classtest/MqttResponse$Student;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lrc/w;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method private final defaultSelectedList()Ljava/util/LinkedHashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/friday/lecture/model/ClassTestHelper;->getUserId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {v0}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lrc/y0;->g([Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method private final getName()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v6, "\u5434"

    .line 7
    .line 8
    const-string v7, "\u5b63"

    .line 9
    .line 10
    const-string v1, "\u8d75"

    .line 11
    .line 12
    const-string v2, "\u94b1"

    .line 13
    .line 14
    const-string v3, "\u5b59"

    .line 15
    .line 16
    const-string v4, "\u674e"

    .line 17
    .line 18
    const-string v5, "\u5468"

    .line 19
    .line 20
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x6

    .line 25
    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    aget-object v1, v1, v2

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x2

    .line 37
    const/16 v4, 0x94

    .line 38
    .line 39
    const-string v5, "substring(...)"

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    rem-int/lit8 v2, v0, 0x2

    .line 48
    .line 49
    const-string v3, "\u79c0\u5a1f\u82f1\u534e\u6167\u5de7\u7f8e\u5a1c\u9759\u6dd1\u60e0\u73e0\u7fe0\u96c5\u829d\u7389\u840d\u7ea2\u5a25\u73b2\u82ac\u82b3\u71d5\u5f69\u6625\u83ca\u5170\u51e4\u6d01\u6885\u7433\u7d20\u4e91\u83b2\u771f\u73af\u96ea\u8363\u7231\u59b9\u971e\u9999\u6708\u83ba\u5a9b\u8273\u745e\u51e1\u4f73\u5609\u743c\u52e4\u73cd\u8d1e\u8389\u6842\u5a23\u53f6\u74a7\u7490\u5a05\u7426\u6676\u598d\u831c\u79cb\u73ca\u838e\u9526\u9edb\u9752\u5029\u5a77\u59e3\u5a49\u5a34\u747e\u9896\u9732\u7476\u6021\u5a75\u96c1\u84d3\u7ea8\u4eea\u8377\u4e39\u84c9\u7709\u541b\u7434\u854a\u8587\u83c1\u68a6\u5c9a\u82d1\u5a55\u99a8\u7457\u7430\u97f5\u878d\u56ed\u827a\u548f\u537f\u806a\u6f9c\u7eaf\u6bd3\u60a6\u662d\u51b0\u723d\u742c\u8317\u7fbd\u5e0c\u5b81\u6b23\u98d8\u80b2\u6ee2\u99a5\u7b60\u67d4\u7af9\u972d\u51dd\u6653\u6b22\u9704\u67ab\u82b8\u83f2\u5bd2\u4f0a\u4e9a\u5b9c\u53ef\u59ec\u8212\u5f71\u8354\u679d\u601d\u4e3d "

    .line 50
    .line 51
    if-nez v2, :cond_0

    .line 52
    .line 53
    add-int/lit8 v2, v0, 0x2

    .line 54
    .line 55
    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 79
    .line 80
    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    new-instance v2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0

    .line 103
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    rem-int/lit8 v2, v0, 0x2

    .line 108
    .line 109
    const-string v3, "\u4f1f\u521a\u52c7\u6bc5\u4fca\u5cf0\u5f3a\u519b\u5e73\u4fdd\u4e1c\u6587\u8f89\u529b\u660e\u6c38\u5065\u4e16\u5e7f\u5fd7\u4e49\u5174\u826f\u6d77\u5c71\u4ec1\u6ce2\u5b81\u8d35\u798f\u751f\u9f99\u5143\u5168\u56fd\u80dc\u5b66\u7965\u624d\u53d1\u6b66\u65b0\u5229\u6e05\u98de\u5f6c\u5bcc\u987a\u4fe1\u5b50\u6770\u6d9b\u660c\u6210\u5eb7\u661f\u5149\u5929\u8fbe\u5b89\u5ca9\u4e2d\u8302\u8fdb\u6797\u6709\u575a\u548c\u5f6a\u535a\u8bda\u5148\u656c\u9707\u632f\u58ee\u4f1a\u601d\u7fa4\u8c6a\u5fc3\u90a6\u627f\u4e50\u7ecd\u529f\u677e\u5584\u539a\u5e86\u78ca\u6c11\u53cb\u88d5\u6cb3\u54f2\u6c5f\u8d85\u6d69\u4eae\u653f\u8c26\u4ea8\u5947\u56fa\u4e4b\u8f6e\u7ff0\u6717\u4f2f\u5b8f\u8a00\u82e5\u9e23\u670b\u658c\u6881\u680b\u7ef4\u542f\u514b\u4f26\u7fd4\u65ed\u9e4f\u6cfd\u6668\u8fb0\u58eb\u4ee5\u5efa\u5bb6\u81f4\u6811\u708e\u5fb7\u884c\u65f6\u6cf0\u76db\u96c4\u741b\u94a7\u51a0\u7b56\u817e\u6960\u6995\u98ce\u822a\u5f18"

    .line 110
    .line 111
    if-nez v2, :cond_2

    .line 112
    .line 113
    add-int/lit8 v2, v0, 0x2

    .line 114
    .line 115
    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    new-instance v2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :cond_2
    add-int/lit8 v2, v0, 0x1

    .line 139
    .line 140
    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0
.end method

.method private final getUserId()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private final resetSelectedAndDemoList()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/lecture/model/ClassTestHelper;->defaultSelectedList()Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/friday/lecture/model/ClassTestHelper;->defaultDemonstratingList()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 12
    .line 13
    return-void
.end method

.method private static final setStudentList$lambda$4(Lcom/friday/common/classtest/MqttResponse$Student;Lcom/friday/common/classtest/MqttResponse$Student;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Ljava/util/Locale;->CHINESE:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-static {v0}, Ljava/text/Collator;->getInstance(Ljava/util/Locale;)Ljava/text/Collator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p0, p1}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method private static final setStudentList$lambda$5(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method


# virtual methods
.method public final addSubmitted(Lcom/friday/common/classtest/MqttResponse$Student;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->submittedStudentList:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final classEnd()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->recentlyHomework:Lcom/friday/common/classtest/MqttResponse;

    .line 3
    .line 4
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->submittedStudentList:Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final clearSelectedList()V
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getDemonstratingList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFullscreenMember()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->fullscreenMember:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnlineList()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->onlineList:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public final getOnlineList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;"
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->privateOnlineList:Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final getRandomlySelectedMember()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->randomlySelectedMember:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRecentlyHomework()Lcom/friday/common/classtest/MqttResponse;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->recentlyHomework:Lcom/friday/common/classtest/MqttResponse;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectedList()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStudentList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->privateOnlineList:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    return-object v0
.end method

.method public final getSubmittedCount()I
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->submittedStudentList:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getSubmittedList()Ljava/util/LinkedHashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashSet<",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->submittedStudentList:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final removeFromDemonstratingList(Lkotlin/Pair;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "student"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->fullscreenMember:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    sget-object p1, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/4 v0, 0x1

    .line 51
    if-ne p1, v0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void

    .line 55
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 56
    invoke-virtual {p0, p1}, Lcom/friday/lecture/model/ClassTestHelper;->setFullscreenMember(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final resetState()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->recentlyHomework:Lcom/friday/common/classtest/MqttResponse;

    .line 3
    .line 4
    sget-object v1, Lcom/friday/lecture/model/ClassTestHelper;->submittedStudentList:Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lcom/friday/lecture/model/ClassTestHelper;->privateOnlineList:Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lcom/friday/lecture/model/ClassTestHelper;->resetSelectedAndDemoList()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->randomlySelectedMember:Ljava/lang/String;

    .line 22
    .line 23
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->fullscreenMember:Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method

.method public final setFullscreenMember(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/friday/lecture/model/ClassTestHelper;->fullscreenMember:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setRandomMember(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/friday/lecture/model/ClassTestHelper;->randomlySelectedMember:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setRecentlyHomework(Lcom/friday/common/classtest/MqttResponse;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/friday/lecture/model/ClassTestHelper;->recentlyHomework:Lcom/friday/common/classtest/MqttResponse;

    .line 2
    .line 3
    return-void
.end method

.method public final setStudentList(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    check-cast p1, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-static {p1}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_1
    new-instance v0, Lj3/a;

    .line 17
    .line 18
    invoke-direct {v0}, Lj3/a;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lj3/b;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lj3/b;-><init>(Lhd/p;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v1}, Lrc/a0;->A(Ljava/util/List;Ljava/util/Comparator;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 30
    .line 31
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Lcom/friday/common/helper/b;->u()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->t()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v2, v1}, Lcom/friday/common/classtest/MqttResponse$Student;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-interface {p1, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 63
    .line 64
    .line 65
    sget-object v2, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    const/4 v4, 0x0

    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Ljava/lang/String;

    .line 83
    .line 84
    move-object v5, p1

    .line 85
    check-cast v5, Ljava/lang/Iterable;

    .line 86
    .line 87
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    move-object v7, v6

    .line 102
    check-cast v7, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 103
    .line 104
    invoke-virtual {v7}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-static {v7, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_3

    .line 113
    .line 114
    move-object v4, v6

    .line 115
    :cond_4
    if-eqz v4, :cond_2

    .line 116
    .line 117
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_5
    sget-object v2, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    .line 124
    .line 125
    .line 126
    sget-object v2, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 127
    .line 128
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 129
    .line 130
    .line 131
    move-object v0, p1

    .line 132
    check-cast v0, Ljava/lang/Iterable;

    .line 133
    .line 134
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_7

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    move-object v3, v2

    .line 149
    check-cast v3, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 150
    .line 151
    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    sget-object v5, Lcom/friday/lecture/model/ClassTestHelper;->randomlySelectedMember:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {v3, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_6

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_7
    move-object v2, v4

    .line 165
    :goto_1
    check-cast v2, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 166
    .line 167
    if-eqz v2, :cond_8

    .line 168
    .line 169
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    goto :goto_2

    .line 174
    :cond_8
    move-object v0, v4

    .line 175
    :goto_2
    sput-object v0, Lcom/friday/lecture/model/ClassTestHelper;->randomlySelectedMember:Ljava/lang/String;

    .line 176
    .line 177
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 178
    .line 179
    check-cast v0, Ljava/lang/Iterable;

    .line 180
    .line 181
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_b

    .line 190
    .line 191
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    add-int/lit8 v3, v1, 0x1

    .line 196
    .line 197
    if-gez v1, :cond_9

    .line 198
    .line 199
    invoke-static {}, Lrc/w;->w()V

    .line 200
    .line 201
    .line 202
    :cond_9
    check-cast v2, Lkotlin/Pair;

    .line 203
    .line 204
    invoke-virtual {v2}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-interface {p1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-nez v5, :cond_a

    .line 213
    .line 214
    sget-object v5, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 215
    .line 216
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 217
    .line 218
    const/4 v7, 0x2

    .line 219
    invoke-static {v2, v6, v4, v7, v4}, Lkotlin/Pair;->e(Lkotlin/Pair;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lkotlin/Pair;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-interface {v5, v1, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    sget-object v1, Lcom/friday/lecture/model/ClassTestHelper;->randomlySelectedMember:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v2}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 233
    .line 234
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_a

    .line 243
    .line 244
    sput-object v4, Lcom/friday/lecture/model/ClassTestHelper;->randomlySelectedMember:Ljava/lang/String;

    .line 245
    .line 246
    :cond_a
    move v1, v3

    .line 247
    goto :goto_3

    .line 248
    :cond_b
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->privateOnlineList:Landroidx/lifecycle/MutableLiveData;

    .line 249
    .line 250
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    return-void
.end method

.method public final setTeacherDemonstrating()V
    .locals 6

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 7
    .line 8
    new-instance v1, Lkotlin/Pair;

    .line 9
    .line 10
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    new-instance v3, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 13
    .line 14
    sget-object v4, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 15
    .line 16
    invoke-virtual {v4}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Lcom/friday/common/helper/b;->u()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-direct {p0}, Lcom/friday/lecture/model/ClassTestHelper;->getUserId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-direct {v3, v4, v5}, Lcom/friday/common/classtest/MqttResponse$Student;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final timeUp()V
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->recentlyHomework:Lcom/friday/common/classtest/MqttResponse;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Lcom/friday/common/classtest/MqttResponse$Data;->setCanSubmit(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final updateDemonstratingList()V
    .locals 6

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 7
    .line 8
    sget-object v1, Lcom/friday/lecture/model/ClassTestHelper;->onlineList:Landroidx/lifecycle/LiveData;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/util/List;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Iterable;

    .line 19
    .line 20
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    move-object v4, v3

    .line 40
    check-cast v4, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 41
    .line 42
    sget-object v5, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    invoke-virtual {v4}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :cond_2
    invoke-static {v2}, Lke/d;->S(Ljava/util/List;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/lang/Iterable;

    .line 67
    .line 68
    new-instance v2, Ljava/util/ArrayList;

    .line 69
    .line 70
    const/16 v3, 0xa

    .line 71
    .line 72
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 94
    .line 95
    new-instance v4, Lkotlin/Pair;

    .line 96
    .line 97
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-direct {v4, v5, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 107
    .line 108
    .line 109
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->demonstratingList:Ljava/util/List;

    .line 110
    .line 111
    check-cast v0, Ljava/lang/Iterable;

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    const/4 v2, 0x0

    .line 122
    if-eqz v1, :cond_5

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    move-object v3, v1

    .line 129
    check-cast v3, Lkotlin/Pair;

    .line 130
    .line 131
    invoke-virtual {v3}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 136
    .line 137
    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    sget-object v4, Lcom/friday/lecture/model/ClassTestHelper;->fullscreenMember:Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_4

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    move-object v1, v2

    .line 151
    :goto_2
    if-nez v1, :cond_6

    .line 152
    .line 153
    invoke-virtual {p0, v2}, Lcom/friday/lecture/model/ClassTestHelper;->setFullscreenMember(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_6
    return-void
.end method

.method public final updateSelectedList(Lcom/friday/common/classtest/MqttResponse$Student;)V
    .locals 2

    .line 1
    const-string v0, "student"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->selectedList:Ljava/util/LinkedHashSet;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method
