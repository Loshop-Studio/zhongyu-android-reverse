.class public final synthetic Lcc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final synthetic c:Lcc/d;


# direct methods
.method public synthetic constructor <init>(Lcc/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcc/c;->c:Lcc/d;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcc/c;->c:Lcc/d;

    invoke-virtual {v0}, Lcc/d;->a()V

    return-void
.end method
