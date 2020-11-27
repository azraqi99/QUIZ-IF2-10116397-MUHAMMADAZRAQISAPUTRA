/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Rock and Roll Haircut
 */
package quiz.if2.pkg10116397.muhammadazraqisaputra;

/**
 *
 * @author Zetro
 */
public interface ServiceItem 
{
    public void displayService();
    public float getPrice(int serviceItem);
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float parServicePrice);
}
