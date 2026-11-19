.class final Lz1/b$b$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz1/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz1/b$b;


# direct methods
.method constructor <init>(Lz1/b$b;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$m;->a:Lz1/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lz1/b$b$m;->a:Lz1/b$b;

    new-instance v1, Lz1/b$b$m$a;

    invoke-direct {v1, p0}, Lz1/b$b$m$a;-><init>(Lz1/b$b$m;)V

    invoke-virtual {v0, v1}, Lz1/b$b;->c(Lx2/l;)V

    return-void
.end method
