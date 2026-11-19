.class public final synthetic Ln9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Li9/h;

.field public final synthetic b:Lokhttp3/c;

.field public final synthetic c:Li9/a;


# direct methods
.method public synthetic constructor <init>(Li9/h;Lokhttp3/c;Li9/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln9/c;->a:Li9/h;

    iput-object p2, p0, Ln9/c;->b:Lokhttp3/c;

    iput-object p3, p0, Ln9/c;->c:Li9/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ln9/c;->a:Li9/h;

    iget-object v1, p0, Ln9/c;->b:Lokhttp3/c;

    iget-object v2, p0, Ln9/c;->c:Li9/a;

    invoke-static {v0, v1, v2}, Ln9/e;->g(Li9/h;Lokhttp3/c;Li9/a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
