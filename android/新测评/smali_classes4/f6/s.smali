.class public final synthetic Lf6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZJLjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/s;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lf6/s;->b:Z

    iput-wide p3, p0, Lf6/s;->c:J

    iput-object p5, p0, Lf6/s;->d:Ljava/lang/String;

    iput-boolean p6, p0, Lf6/s;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lf6/s;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lf6/s;->b:Z

    iget-wide v2, p0, Lf6/s;->c:J

    iget-object v4, p0, Lf6/s;->d:Ljava/lang/String;

    iget-boolean v5, p0, Lf6/s;->e:Z

    move-object v6, p1

    check-cast v6, Landroid/view/View;

    invoke-static/range {v0 .. v6}, Lf6/u;->a(Ljava/lang/String;ZJLjava/lang/String;ZLandroid/view/View;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
