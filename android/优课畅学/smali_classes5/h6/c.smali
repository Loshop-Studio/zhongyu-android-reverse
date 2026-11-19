.class public final synthetic Lh6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final synthetic a:Lh6/d;


# direct methods
.method public synthetic constructor <init>(Lh6/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh6/c;->a:Lh6/d;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/c;->a:Lh6/d;

    invoke-virtual {v0}, Lh6/d;->a()V

    return-void
.end method
