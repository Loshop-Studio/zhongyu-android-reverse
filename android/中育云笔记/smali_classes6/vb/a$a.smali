.class public final Lvb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/widget/SketchProgressView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvb/a;->b(Lcom/zykj/view/widget/SketchProgressView;Lhd/a;Lhd/l;Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhd/a;

.field public final synthetic b:Lhd/l;

.field public final synthetic c:Lhd/l;


# direct methods
.method public constructor <init>(Lhd/a;Lhd/l;Lhd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvb/a$a;->a:Lhd/a;

    .line 2
    .line 3
    iput-object p2, p0, Lvb/a$a;->b:Lhd/l;

    .line 4
    .line 5
    iput-object p3, p0, Lvb/a$a;->c:Lhd/l;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvb/a$a;->c:Lhd/l;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lvb/a$a;->a:Lhd/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onProgress(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvb/a$a;->b:Lhd/l;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method
