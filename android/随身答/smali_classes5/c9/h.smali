.class public final synthetic Lc9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc9/g$b$a;

.field public final synthetic b:Lc9/d;

.field public final synthetic c:Lc9/x;


# direct methods
.method public synthetic constructor <init>(Lc9/g$b$a;Lc9/d;Lc9/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/h;->a:Lc9/g$b$a;

    iput-object p2, p0, Lc9/h;->b:Lc9/d;

    iput-object p3, p0, Lc9/h;->c:Lc9/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc9/h;->a:Lc9/g$b$a;

    iget-object v1, p0, Lc9/h;->b:Lc9/d;

    iget-object v2, p0, Lc9/h;->c:Lc9/x;

    invoke-static {v0, v1, v2}, Lc9/g$b$a;->d(Lc9/g$b$a;Lc9/d;Lc9/x;)V

    return-void
.end method
