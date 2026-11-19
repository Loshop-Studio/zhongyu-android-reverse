.class public final Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/compose/MotionLayoutScope;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "MotionProperties"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001b\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0003J\u001b\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u000cJ\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0003J\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;",
        "",
        "id",
        "",
        "tag",
        "(Landroidx/constraintlayout/compose/MotionLayoutScope;Ljava/lang/String;Ljava/lang/String;)V",
        "myId",
        "myTag",
        "color",
        "Landroidx/compose/ui/graphics/Color;",
        "name",
        "color-vNxB06k",
        "(Ljava/lang/String;)J",
        "distance",
        "Landroidx/compose/ui/unit/Dp;",
        "distance-u2uoSUM",
        "(Ljava/lang/String;)F",
        "float",
        "",
        "fontSize",
        "Landroidx/compose/ui/unit/TextUnit;",
        "fontSize-kPz2Gy4",
        "int",
        "",
        "constraintlayout-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1651:1\n169#2:1652\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties\n*L\n858#1:1652\n*E\n"
    }
.end annotation


# instance fields
.field private myId:Ljava/lang/String;

.field private myTag:Ljava/lang/String;

.field final synthetic this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/compose/MotionLayoutScope;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->myId:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->myTag:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final color-vNxB06k(Ljava/lang/String;)J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/constraintlayout/compose/MotionLayoutScope;->access$getMeasurer$p(Landroidx/constraintlayout/compose/MotionLayoutScope;)Landroidx/constraintlayout/compose/MotionMeasurer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->myId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 10
    .line 11
    invoke-static {v2}, Landroidx/constraintlayout/compose/MotionLayoutScope;->access$getMotionProgress$p(Landroidx/constraintlayout/compose/MotionLayoutScope;)Landroidx/compose/runtime/MutableFloatState;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0, v1, p1, v2}, Landroidx/constraintlayout/compose/MotionMeasurer;->getCustomColor-XeAY9LY(Ljava/lang/String;Ljava/lang/String;F)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    return-wide v0
.end method

.method public final distance-u2uoSUM(Ljava/lang/String;)F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/constraintlayout/compose/MotionLayoutScope;->access$getMeasurer$p(Landroidx/constraintlayout/compose/MotionLayoutScope;)Landroidx/constraintlayout/compose/MotionMeasurer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->myId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 10
    .line 11
    invoke-static {v2}, Landroidx/constraintlayout/compose/MotionLayoutScope;->access$getMotionProgress$p(Landroidx/constraintlayout/compose/MotionLayoutScope;)Landroidx/compose/runtime/MutableFloatState;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0, v1, p1, v2}, Landroidx/constraintlayout/compose/MotionMeasurer;->getCustomFloat(Ljava/lang/String;Ljava/lang/String;F)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public final float(Ljava/lang/String;)F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/constraintlayout/compose/MotionLayoutScope;->access$getMeasurer$p(Landroidx/constraintlayout/compose/MotionLayoutScope;)Landroidx/constraintlayout/compose/MotionMeasurer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->myId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 10
    .line 11
    invoke-static {v2}, Landroidx/constraintlayout/compose/MotionLayoutScope;->access$getMotionProgress$p(Landroidx/constraintlayout/compose/MotionLayoutScope;)Landroidx/compose/runtime/MutableFloatState;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0, v1, p1, v2}, Landroidx/constraintlayout/compose/MotionMeasurer;->getCustomFloat(Ljava/lang/String;Ljava/lang/String;F)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public final fontSize-kPz2Gy4(Ljava/lang/String;)J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/constraintlayout/compose/MotionLayoutScope;->access$getMeasurer$p(Landroidx/constraintlayout/compose/MotionLayoutScope;)Landroidx/constraintlayout/compose/MotionMeasurer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->myId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 10
    .line 11
    invoke-static {v2}, Landroidx/constraintlayout/compose/MotionLayoutScope;->access$getMotionProgress$p(Landroidx/constraintlayout/compose/MotionLayoutScope;)Landroidx/compose/runtime/MutableFloatState;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0, v1, p1, v2}, Landroidx/constraintlayout/compose/MotionMeasurer;->getCustomFloat(Ljava/lang/String;Ljava/lang/String;F)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    return-wide v0
.end method

.method public final id()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->myId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final int(Ljava/lang/String;)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/constraintlayout/compose/MotionLayoutScope;->access$getMeasurer$p(Landroidx/constraintlayout/compose/MotionLayoutScope;)Landroidx/constraintlayout/compose/MotionMeasurer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->myId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->this$0:Landroidx/constraintlayout/compose/MotionLayoutScope;

    .line 10
    .line 11
    invoke-static {v2}, Landroidx/constraintlayout/compose/MotionLayoutScope;->access$getMotionProgress$p(Landroidx/constraintlayout/compose/MotionLayoutScope;)Landroidx/compose/runtime/MutableFloatState;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0, v1, p1, v2}, Landroidx/constraintlayout/compose/MotionMeasurer;->getCustomFloat(Ljava/lang/String;Ljava/lang/String;F)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    float-to-int p1, p1

    .line 24
    return p1
.end method

.method public final tag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;->myTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
