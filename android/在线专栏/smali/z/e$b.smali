.class Lz/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/e;->d(Landroid/content/Context;Lz/d;ILjava/util/concurrent/Executor;Lz/a;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb0/a<",
        "Lz/e$e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lz/a;


# direct methods
.method constructor <init>(Lz/a;)V
    .locals 0

    iput-object p1, p0, Lz/e$b;->a:Lz/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lz/e$e;)V
    .locals 1

    iget-object v0, p0, Lz/e$b;->a:Lz/a;

    invoke-virtual {v0, p1}, Lz/a;->b(Lz/e$e;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lz/e$e;

    invoke-virtual {p0, p1}, Lz/e$b;->a(Lz/e$e;)V

    return-void
.end method
