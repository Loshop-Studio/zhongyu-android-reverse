.class public interface abstract Lje/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lje/n$a;
    }
.end annotation


# static fields
.field public static final a:Lje/n$a;

.field public static final b:Lje/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lje/n$a;->a:Lje/n$a;

    .line 2
    .line 3
    sput-object v0, Lje/n;->a:Lje/n$a;

    .line 4
    .line 5
    new-instance v0, Lje/n$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lje/n$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lje/n;->b:Lje/n;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
.end method
