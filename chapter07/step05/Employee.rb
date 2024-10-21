Employee = Struct.new(:name, :basePay, :hourly, :timeCard) do
    def calculatePay(taxRate)
        if(hourly) then
            return calculateHourlyPay(taxRate)
        end
        return calculateSalariedPay(taxRate)
    end

private
    def calculateHourlyPay(taxRate)
        return (basePay * timeCard) - (basePay * timeCard) * timeCard
    end

    def calculateSalariedPay(taxRate)
        return basePay - (basePay * taxRate)
    end

    def monthlyBasePay()
        if(hourly) then return 0 end
        return basePay
    end
end