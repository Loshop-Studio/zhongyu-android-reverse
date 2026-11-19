.class public final synthetic Lf6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lf6/j;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lf6/j;Lkotlin/jvm/functions/Function1;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/r;->a:Lf6/j;

    iput-object p2, p0, Lf6/r;->b:Lkotlin/jvm/functions/Function1;

    iput-wide p3, p0, Lf6/r;->c:J

    iput-object p5, p0, Lf6/r;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lf6/r;->a:Lf6/j;

    iget-object v1, p0, Lf6/r;->b:Lkotlin/jvm/functions/Function1;

    iget-wide v2, p0, Lf6/r;->c:J

    iget-object v4, p0, Lf6/r;->d:Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Landroid/content/Context;

    invoke-static/range {v0 .. v5}, Lf6/u;->c(Lf6/j;Lkotlin/jvm/functions/Function1;JLjava/lang/String;Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
