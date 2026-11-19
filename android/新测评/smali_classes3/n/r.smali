.class public interface abstract Ln/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/r$a;
    }
.end annotation


# virtual methods
.method public abstract e()Lokio/Path;
.end method

.method public abstract getFileSystem()Lokio/FileSystem;
.end method

.method public abstract getMetadata()Ln/r$a;
.end method

.method public abstract source()Lokio/BufferedSource;
.end method
