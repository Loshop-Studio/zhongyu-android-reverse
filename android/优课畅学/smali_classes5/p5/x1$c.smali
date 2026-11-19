.class public final Lp5/x1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/IAreaMoveListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/x1;->c(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/a;Lx7/p;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public final synthetic c:Lx7/p;

.field public final synthetic d:Lx7/a;

.field public final synthetic e:Lx7/a;


# direct methods
.method public constructor <init>(Lx7/p;Lx7/a;Lx7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp5/x1$c;->c:Lx7/p;

    .line 2
    .line 3
    iput-object p2, p0, Lp5/x1$c;->d:Lx7/a;

    .line 4
    .line 5
    iput-object p3, p0, Lp5/x1$c;->e:Lx7/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onHorizontalMove(F)V
    .locals 2

    .line 1
    iput p1, p0, Lp5/x1$c;->b:F

    .line 2
    .line 3
    iget-object p1, p0, Lp5/x1$c;->c:Lx7/p;

    .line 4
    .line 5
    iget v0, p0, Lp5/x1$c;->a:F

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lp5/x1$c;->b:F

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {p1, v0, v1}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onMoveEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/x1$c;->e:Lx7/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onMoveStart()V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/x1$c;->d:Lx7/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onVerticalMove(F)V
    .locals 2

    .line 1
    iput p1, p0, Lp5/x1$c;->a:F

    .line 2
    .line 3
    iget-object v0, p0, Lp5/x1$c;->c:Lx7/p;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v1, p0, Lp5/x1$c;->b:F

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, p1, v1}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method
