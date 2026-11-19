.class public interface abstract Lb0/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb0/c$a$a;
    }
.end annotation


# static fields
.field public static final a:Lb0/c$a$a;

.field public static final b:Lb0/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lb0/c$a$a;->a:Lb0/c$a$a;

    .line 2
    .line 3
    sput-object v0, Lb0/c$a;->a:Lb0/c$a$a;

    .line 4
    .line 5
    new-instance v0, Lb0/b$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lb0/b$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lb0/c$a;->b:Lb0/c$a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(Lb0/d;Ly/j;)Lb0/c;
.end method
