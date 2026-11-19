.class public final synthetic Lv7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final synthetic a:Lv7/d;


# direct methods
.method public synthetic constructor <init>(Lv7/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/c;->a:Lv7/d;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/c;->a:Lv7/d;

    invoke-virtual {v0}, Lv7/d;->a()V

    return-void
.end method
