.class public final synthetic Lk8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final synthetic a:Lk8/d;


# direct methods
.method public synthetic constructor <init>(Lk8/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/c;->a:Lk8/d;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/c;->a:Lk8/d;

    invoke-virtual {v0}, Lk8/d;->a()V

    return-void
.end method
