# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class public final Lcom/zykj/view/utils/SPDataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0002\"\u0014\u0010\u0008\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0002\"\u0014\u0010\n\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0002\"\u0014\u0010\u000f\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\"(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\"(\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\"(\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001d\u0010\u0019\"\u0004\u0008\u001e\u0010\u001b\"(\u0010\"\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010\u0019\"\u0004\u0008!\u0010\u001b\"(\u0010(\u001a\u0004\u0018\u00010#2\u0008\u0010\u0011\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'\"(\u0010+\u001a\u0004\u0018\u00010#2\u0008\u0010\u0011\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008)\u0010%\"\u0004\u0008*\u0010\'\"(\u0010.\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008,\u0010\u0019\"\u0004\u0008-\u0010\u001b\"(\u00101\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008/\u0010\u0019\"\u0004\u00080\u0010\u001b\"(\u00104\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00082\u0010\u0019\"\u0004\u00083\u0010\u001b\"4\u0010;\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001052\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001058F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:\u00a8\u0006<"
    }
    d2 = {
        "",
        "IS_TOUCHABLE",
        "Ljava/lang/String;",
        "PEN_TYPE_LEVEL",
        "PEN_COLOR",
        "PEN_SIZE_LEVEL",
        "ERASER_SIZE",
        "TEXT_SIZE",
        "TEXT_COLOR",
        "GEOMETRY_COLOR",
        "BACKGROUND_COLOR",
        "SELECT_GRAPH_ENUM_LIST",
        "Lcom/blankj/utilcode/util/l;",
        "getSpUtils",
        "()Lcom/blankj/utilcode/util/l;",
        "spUtils",
        "",
        "value",
        "getSpTouchable",
        "()Ljava/lang/Boolean;",
        "setSpTouchable",
        "(Ljava/lang/Boolean;)V",
        "spTouchable",
        "",
        "getSpPenTypeLevel",
        "()Ljava/lang/Integer;",
        "setSpPenTypeLevel",
        "(Ljava/lang/Integer;)V",
        "spPenTypeLevel",
        "getSpPenColor",
        "setSpPenColor",
        "spPenColor",
        "getSpPenSizeLevel",
        "setSpPenSizeLevel",
        "spPenSizeLevel",
        "",
        "getSpEraserSize",
        "()Ljava/lang/Float;",
        "setSpEraserSize",
        "(Ljava/lang/Float;)V",
        "spEraserSize",
        "getSpTextSize",
        "setSpTextSize",
        "spTextSize",
        "getSpTextColor",
        "setSpTextColor",
        "spTextColor",
        "getSpGeometryColor",
        "setSpGeometryColor",
        "spGeometryColor",
        "getSpBackgroundColor",
        "setSpBackgroundColor",
        "spBackgroundColor",
        "",
        "Lcom/zykj/blackboard/enums/SelectGraphEnum;",
        "getSpSelectGraphEnum",
        "()Ljava/util/List;",
        "setSpSelectGraphEnum",
        "(Ljava/util/List;)V",
        "spSelectGraphEnum",
        "view_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSPData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SPData.kt\ncom/zykj/view/utils/SPDataKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1#2:108\n1563#3:109\n1634#3,3:110\n1869#3,2:113\n*S KotlinDebug\n*F\n+ 1 SPData.kt\ncom/zykj/view/utils/SPDataKt\n*L\n93#1:109\n93#1:110,3\n101#1:113,2\n*E\n"
    }
.end annotation


# static fields
.field public static final BACKGROUND_COLOR:Ljava/lang/String; = "BACKGROUND_COLOR_INT"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final ERASER_SIZE:Ljava/lang/String; = "ERASER_SIZE_FLOAT"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final GEOMETRY_COLOR:Ljava/lang/String; = "GEOMETRY_COLOR_INT"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final IS_TOUCHABLE:Ljava/lang/String; = "IS_TOUCHABLE"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PEN_COLOR:Ljava/lang/String; = "PEN_COLOR"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PEN_SIZE_LEVEL:Ljava/lang/String; = "PEN_SIZE_LEVEL"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PEN_TYPE_LEVEL:Ljava/lang/String; = "PEN_TYPE_LEVEL"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SELECT_GRAPH_ENUM_LIST:Ljava/lang/String; = "SELECT_GRAPH_ENUM_LIST"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TEXT_COLOR:Ljava/lang/String; = "TEXT_COLOR"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TEXT_SIZE:Ljava/lang/String; = "TEXT_SIZE"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static final getSpBackgroundColor()Ljava/lang/Integer;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v1, "BACKGROUND_COLOR_INT"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/l;->b(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

# RE I/O 读取浮点偏好（SharedPreferences.getFloat）。
.method public static final getSpEraserSize()Ljava/lang/Float;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v1, "ERASER_SIZE_FLOAT"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/high16 v2, -0x40800000    # -1.0f

    .line 20
    .line 21
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    return-object v0
.end method

.method public static final getSpGeometryColor()Ljava/lang/Integer;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v1, "GEOMETRY_COLOR_INT"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/l;->b(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

.method public static final getSpPenColor()Ljava/lang/Integer;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v1, "PEN_COLOR"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/l;->b(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

.method public static final getSpPenSizeLevel()Ljava/lang/Integer;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v1, "PEN_SIZE_LEVEL"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/l;->b(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

.method public static final getSpPenTypeLevel()Ljava/lang/Integer;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v1, "PEN_TYPE_LEVEL"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/l;->b(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

# RE I/O 读取字符串偏好（SharedPreferences.getString）。
.method public static final getSpSelectGraphEnum()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/enums/SelectGraphEnum;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v1, "SELECT_GRAPH_ENUM_LIST"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v3, ""

    .line 21
    .line 22
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 23
    .line 24
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-lez v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v2

    .line 38
    :goto_0
    if-eqz v0, :cond_2

    .line 39
    .line 40
    const-string v1, "+"

    .line 41
    .line 42
    filled-new-array {v1}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v0, v1}, Lkotlin/text/p;->b0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, Ljava/util/ArrayList;

    .line 51
    .line 52
    const/16 v2, 0xa

    .line 53
    .line 54
    invoke-static {v0, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v2}, Lcom/zykj/blackboard/enums/SelectGraphEnum;->valueOf(Ljava/lang/String;)Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    return-object v1

    .line 86
    :cond_2
    return-object v2
.end method

.method public static final getSpTextColor()Ljava/lang/Integer;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v1, "TEXT_COLOR"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/l;->b(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

# RE I/O 读取浮点偏好（SharedPreferences.getFloat）。
.method public static final getSpTextSize()Ljava/lang/Float;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v1, "TEXT_SIZE"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/high16 v2, -0x40800000    # -1.0f

    .line 20
    .line 21
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    return-object v0
.end method

# RE I/O 读取布尔偏好（SharedPreferences.getBoolean）。
.method public static final getSpTouchable()Ljava/lang/Boolean;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v1, "IS_TOUCHABLE"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v2, 0x0

    .line 20
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 21
    .line 22
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method private static final getSpUtils()Lcom/blankj/utilcode/util/l;
    .locals 1

    .line 1
    const-string v0, "VIEW"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/l;->a(Ljava/lang/String;)Lcom/blankj/utilcode/util/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final setSpBackgroundColor(Ljava/lang/Integer;)V
    .locals 2
    .param p0    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "BACKGROUND_COLOR_INT"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/l;->c(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

# RE I/O 保存浮点偏好（SharedPreferences$Editor.putFloat）。
.method public static final setSpEraserSize(Ljava/lang/Float;)V
    .locals 2
    .param p0    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "ERASER_SIZE_FLOAT"

    .line 18
    .line 19
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public static final setSpGeometryColor(Ljava/lang/Integer;)V
    .locals 2
    .param p0    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "GEOMETRY_COLOR_INT"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/l;->c(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final setSpPenColor(Ljava/lang/Integer;)V
    .locals 2
    .param p0    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "PEN_COLOR"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/l;->c(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final setSpPenSizeLevel(Ljava/lang/Integer;)V
    .locals 2
    .param p0    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "PEN_SIZE_LEVEL"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/l;->c(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final setSpPenTypeLevel(Ljava/lang/Integer;)V
    .locals 2
    .param p0    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "PEN_TYPE_LEVEL"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/l;->c(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

# RE I/O 保存字符串偏好（SharedPreferences$Editor.putString）。
.method public static final setSpSelectGraphEnum(Ljava/util/List;)V
    .locals 2
    .param p0    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/enums/SelectGraphEnum;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 36
    .line 37
    .line 38
    const-string v1, "+"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v0}, Lkotlin/text/p;->W(Ljava/lang/StringBuffer;)Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 57
    .line 58
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "SELECT_GRAPH_ENUM_LIST"

    .line 63
    .line 64
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_1
    return-void
.end method

.method public static final setSpTextColor(Ljava/lang/Integer;)V
    .locals 2
    .param p0    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "TEXT_COLOR"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/l;->c(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

# RE I/O 保存浮点偏好（SharedPreferences$Editor.putFloat）。
.method public static final setSpTextSize(Ljava/lang/Float;)V
    .locals 2
    .param p0    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "TEXT_SIZE"

    .line 18
    .line 19
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

# RE I/O 保存布尔偏好（SharedPreferences$Editor.putBoolean）。
.method public static final setSpTouchable(Ljava/lang/Boolean;)V
    .locals 2
    .param p0    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpUtils()Lcom/blankj/utilcode/util/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lcom/blankj/utilcode/util/l;->a:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "IS_TOUCHABLE"

    .line 18
    .line 19
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method
