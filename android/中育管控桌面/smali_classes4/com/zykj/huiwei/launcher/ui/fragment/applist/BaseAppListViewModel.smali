# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public abstract Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;",
        "Lcom/zykj/base/BaseViewModel;",
        "<init>",
        "()V",
        "",
        "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;",
        "list",
        "Lcom/zykj/huiwei/launcher/bean/resp/AppData;",
        "a",
        "(Ljava/util/List;)Ljava/util/List;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseAppListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAppListViewModel.kt\ncom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1563#2:34\n1634#2,3:35\n1563#2:38\n1634#2,3:39\n1056#2:42\n*S KotlinDebug\n*F\n+ 1 BaseAppListViewModel.kt\ncom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel\n*L\n19#1:34\n19#1:35,3\n23#1:38\n23#1:39,3\n30#1:42\n*E\n"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
# RE I/O 读取 JSON（Gson.fromJson）。
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 6

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/d0;->a()Lcom/blankj/utilcode/util/d0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "SP_APP_SORT_LIST"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/d0;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/google/gson/Gson;

    .line 17
    .line 18
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel$b;

    .line 22
    .line 23
    invoke-direct {v2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel$b;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/util/List;

    .line 35
    .line 36
    const v1, 0x7fffffff

    .line 37
    .line 38
    .line 39
    const/16 v2, 0xa

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 74
    .line 75
    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getLabel()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-interface {v0, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    const/4 v5, -0x1

    .line 84
    if-eq v4, v5, :cond_1

    .line 85
    .line 86
    new-instance v5, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 87
    .line 88
    invoke-direct {v5, v2, v4}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;-><init>(Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    new-instance v5, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 93
    .line 94
    invoke-direct {v5, v2, v1}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;-><init>(Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;I)V

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    new-instance p1, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel$a;

    .line 102
    .line 103
    invoke-direct {p1}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel$a;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {v3, p1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :cond_3
    :goto_2
    new-instance v0, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_4

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 135
    .line 136
    new-instance v3, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 137
    .line 138
    invoke-direct {v3, v2, v1}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;-><init>(Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;I)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    return-object v0
.end method
