.class public final synthetic Lk5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lf5/h;

.field public final synthetic b:Lokhttp3/c;

.field public final synthetic c:Lf5/a;


# direct methods
.method public synthetic constructor <init>(Lf5/h;Lokhttp3/c;Lf5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/c;->a:Lf5/h;

    iput-object p2, p0, Lk5/c;->b:Lokhttp3/c;

    iput-object p3, p0, Lk5/c;->c:Lf5/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/c;->a:Lf5/h;

    iget-object v1, p0, Lk5/c;->b:Lokhttp3/c;

    iget-object v2, p0, Lk5/c;->c:Lf5/a;

    invoke-static {v0, v1, v2}, Lk5/e;->g(Lf5/h;Lokhttp3/c;Lf5/a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
